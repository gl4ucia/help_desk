package br.com.maven.hd.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Historico")
public class HistoricoBeans {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="h_id")
private Long h_id;
@Column(name ="h_ordemservico")
private Long h_ordemservico;
@Column(name ="h_funcionario")
private Long h_funcionario;
@Column(name ="h_status")
private Long h_status;
@Column(name ="h_data")
private Long h_data;

	public Long getH_id() {
		return h_id;
	}
	public void setH_id(Long h_id) {
		this.h_id = h_id;
	}
	public Long getH_ordemservico() {
		return h_ordemservico;
	}
	public void setH_ordemservico(Long h_ordemservico) {
		this.h_ordemservico = h_ordemservico;
	}
	public Long getH_funcionario() {
		return h_funcionario;
	}
	public void setH_funcionario(Long h_funcionario) {
		this.h_funcionario = h_funcionario;
	}
	public Long getH_status() {
		return h_status;
	}
	public void setH_status(Long h_status) {
		this.h_status = h_status;
	}
	public Long getH_data() {
		return h_data;
	}
	public void setH_data(Long h_data) {
		this.h_data = h_data;
	}
}