package br.com.maven.hd.negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.PessoaDao;

@ManagedBean
@SessionScoped
public class PessoaCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private PessoaBeans pessoa;
	private String filtro = "";
	
	public PessoaBeans getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(PessoaBeans pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getFiltro() {
		return filtro;
	}
	
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	public List<PessoaBeans> getListagem() {
		return PessoaDao.listagem(filtro);
	}
	
	public String actionGravar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(pessoa.getPes_id() == 0) {
			PessoaDao.inserir(pessoa);
			context.addMessage(null, new FacesMessage("Sucesso","Inserido com sucesso"));
		}
		else {
			PessoaDao.alterar(pessoa);
			context.addMessage(null, new FacesMessage("Sucesso","Alterado com sucesso"));
		}
		
		return "lista_pessoas";
	}
	
	public String actionInserir() {
		pessoa = new PessoaBeans();
		return "lista_pessoas";
	}
	
	public String actionExcluir() {
		PessoaDao.excluir(pessoa);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso","Excluido com sucesso"));
		return "lista_pessoas";
	}
}

