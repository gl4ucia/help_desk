package br.com.maven.hd.negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.maven.hd.beans.HistoricoBeans;
import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.HistoricoDao;
import br.com.maven.hd.persintencia.PessoaDao;

@ManagedBean
@SessionScoped
public class HistoricoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private HistoricoBeans historico;
	private String filtro = "";
	
	public HistoricoBeans getHistorico() {
		return historico;
	} 
	
	public void setHistorico(HistoricoBeans historico) {
		this.historico = historico;
	}
	
	public String getFiltro() {
		return filtro;
	}
	
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	public List<HistoricoBeans> getListagem() {
		return HistoricoDao.listagem(filtro);
	}
	
	public String actionGravar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(historico.getH_id() == 0) {
			HistoricoDao.inserir(historico);
			context.addMessage(null, new FacesMessage("Sucesso","Inserido com sucesso"));
		}
		else {
			HistoricoDao.alterar(historico);
			context.addMessage(null, new FacesMessage("Sucesso","Alterado com sucesso"));
		}
		
		return "lista_historico";
	}
	
	public String actionInserir() {
		historico = new HistoricoBeans();
		return "lista_historico";
	}
	
	public String actionExcluir() {
		HistoricoDao.excluir(historico);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso","Excluido com sucesso"));
		return "lista_historico";
	}
}

