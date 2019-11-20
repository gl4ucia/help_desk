package br.com.maven.hd.persintencia;


import java.io.Serializable;
import java.util.List;

import javax.management.Query;
import javax.transaction.Transaction;

import org.hibernate.*;


import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.HibernateUtil;

public class HistoricoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(PessoaBeans Pessoa) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.save(Pessoa);
		t.commit();
		sessao.close();
	}

	public static void alterar(PessoaBeans  pessoa) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.update(pessoa);
		t.commit();
		sessao.close();
	}

	public static void excluir(PessoaBeans pessoa) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.delete(pessoa);
		t.commit();
		sessao.close();
	}

	public static List listagem(String filtro) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from pessoa order by pes_nome");
		} else {

			consulta = sessao.createSQLQuery("from produto" + "where pes_nome like :parametro order by pes_nome");
			consulta.setString("parametro", "%" + filtro + "%");

		}
		@SuppressWarnings("deprecation")
		List lista = consulta.list();
		sessao.close();
		return lista;
	}

}
