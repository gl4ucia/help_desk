package br.com.maven.hd.negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.beans.TipoServicoBeans;
import br.com.maven.hd.persintencia.PessoaDao;
import br.com.maven.hd.persintencia.TipoServicoDao;

@ManagedBean
@SessionScoped
public class TipoServicoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private TipoServicoBeans tiposervico;
	private String filtro = "";
	
	public TipoServicoBeans getTipoServico() {
		return tiposervico;
	}
	
	public void setPessoa(TipoServicoBeans pessoa) {
		this.tiposervico = tiposervico;
	}
	
	public String getFiltro() {
		return filtro;
	}
	
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	public List<TipoServicoBeans> getListagem() {
		return TipoServicoDao.listagem(filtro);
	}
	
	public String actionGravar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(tiposervico.getTs_id() == 0) {
			TipoServicoDao.inserir(tiposervico);
			context.addMessage(null, new FacesMessage("Sucesso","Inserido com sucesso"));
		}
		else {
			TipoServicoDao.alterar(tiposervico);
			context.addMessage(null, new FacesMessage("Sucesso","Alterado com sucesso"));
		}
		
		return "lista_pessoas";
	}
	
	public String actionInserir() {
		tiposervico = new TipoServicoBeans();
		return "lista_tiposervico";
	}
	
	public String actionExcluir() {
		TipoServicoDao.excluir(tiposervico);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso","Excluido com sucesso"));
		return "lista_tiposervico";
	}
}

