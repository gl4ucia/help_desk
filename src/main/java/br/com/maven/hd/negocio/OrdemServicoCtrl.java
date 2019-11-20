package br.com.maven.hd.negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.maven.hd.beans.OrdemServicoBeans;
import br.com.maven.hd.beans.PessoaBeans;
import br.com.maven.hd.persintencia.OrdemServicoDao;
import br.com.maven.hd.persintencia.PessoaDao;

@ManagedBean
@SessionScoped
public class OrdemServicoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private OrdemServicoBeans ordemServico;
	private String filtro = "";
	
	public OrdemServicoBeans getOrdemServico() {
		return ordemServico;
	}
	
	public void setPessoa(OrdemServicoBeans OrdemServico) {
		this.ordemServico = ordemServico;
	}
	
	public String getFiltro() {
		return filtro;
	}
	
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	public List<OrdemServicoBeans> getListagem() {
		return OrdemServicoDao.listagem(filtro);
	}
	
	public String actionGravar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(ordemServico.getOs_id() == 0) {
			OrdemServicoDao.inserir(ordemServico);
			context.addMessage(null, new FacesMessage("Sucesso","Inserido com sucesso"));
		}
		else {
			OrdemServicoDao.alterar(ordemServico);
			context.addMessage(null, new FacesMessage("Sucesso","Alterado com sucesso"));
		}
		
		return "lista_OrdemServico";
	}
	
	public String actionInserir() {
		ordemServico = new OrdemServicoBeans();
		return "lista_OrdemServico";
	}
	
	public String actionExcluir() {
		OrdemServicoDao.excluir(ordemServico);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Sucesso","Excluido com sucesso"));
		return "lista_OrdemServico";
	}
}

