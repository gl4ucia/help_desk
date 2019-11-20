package br.com.maven.hd.persintencia;


import java.io.Serializable;
import java.util.List;

import javax.management.Query;
import javax.transaction.Transaction;

import org.hibernate.*;

import br.com.maven.hd.beans.HistoricoBeans;
import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.HibernateUtil;

public class HistoricoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(HistoricoBeans Historico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.save(Historico);
		t.commit();
		sessao.close();
	}

	public static void alterar(HistoricoBeans  historico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.update(historico);
		t.commit();
		sessao.close();
	}

	public static void excluir(HistoricoBeans historico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.delete(historico);
		t.commit();
		sessao.close();
	}

	public static List listagem(String filtro) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from Historico order by h_id");
		} else {

			consulta = sessao.createSQLQuery("from produto" + "where h_id like :parametro order by h_id");
			consulta.setString("parametro", "%" + filtro + "%");

		}
		@SuppressWarnings("deprecation")
		List lista = consulta.list();
		sessao.close();
		return lista;
	}

}
