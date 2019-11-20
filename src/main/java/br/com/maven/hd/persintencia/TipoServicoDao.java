package br.com.maven.hd.persintencia;


import java.io.Serializable;
import java.util.List;

import javax.management.Query;
import javax.transaction.Transaction;

import org.hibernate.*;


import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.beans.TipoServicoBeans;
import br.com.maven.hd.persintencia.HibernateUtil;

public class TipoServicoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(TipoServicoBeans tipoServico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.save(tipoServico);
		t.commit();
		sessao.close();
	}

	public static void alterar(TipoServicoBeans  tiposervico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.update(tiposervico);
		t.commit();
		sessao.close();
	}

	public static void excluir(TipoServicoBeans tiposervico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.delete(tiposervico);
		t.commit();
		sessao.close();
	}

	public static List listagem(String filtro) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from tiposervico order by ts_id");
		} else {

			consulta = sessao.createSQLQuery("from tiposervico" + "where ts_id like :parametro order by ts_id");
			consulta.setString("parametro", "%" + filtro + "%");

		}
		@SuppressWarnings("deprecation")
		List lista = consulta.list();
		sessao.close();
		return lista;
	}

}
