package br.com.maven.hd.persintencia;


import java.io.Serializable;
import java.util.List;

import javax.management.Query;
import javax.transaction.Transaction;

import org.hibernate.*;

import br.com.maven.hd.beans.OrdemServicoBeans;
import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.HibernateUtil;

public class OrdemServicoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(OrdemServicoBeans ordemServico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.save(ordemServico);
		t.commit();
		sessao.close();
	}

	public static void alterar(OrdemServicoBeans  OrdemServico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.update(OrdemServico);
		t.commit();
		sessao.close();
	}

	public static void excluir(OrdemServicoBeans ordemServico) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Transaction t = sessao.beginTransaction();
		sessao.delete(ordemServico);
		t.commit();
		sessao.close();
	}

	public static List listagem(String filtro) {
		Session sessao = HibernateUtil.geSessionFactory().openSession();
		org.hibernate.Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from ordemservico order by os_id");
		} else {

			consulta = sessao.createSQLQuery("from ordemservico" + "where os_id like :parametro order by os_id");
			consulta.setString("parametro", "%" + filtro + "%");

		}
		@SuppressWarnings("deprecation")
		List lista = consulta.list();
		sessao.close();
		return lista;
	}

}
