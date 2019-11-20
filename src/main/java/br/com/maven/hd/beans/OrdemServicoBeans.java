package br.com.maven.hd.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrdemServico ")
public class OrdemServicoBeans {
	
	@Column(name ="os_id")
	private Long os_id;
	
	@Column(name ="osts_id ")
	private Long osts_id ;
	
	@Column(name ="osh_id")
	private Long osh_id;
	
	@Column(name ="osh_funcionario ")
	private Long osh_funcionario ;
	
	@Column(name ="os_ordemservico ")
	private Long os_ordemservico;
	
	@Column(name ="ospes_id_ ")
	private Long ospes_id_ ;
	
	@Column(name ="ospes_cliente_ ")
	private Long ospes_cliente_ ;
	
	@Column(name ="hospes_funcionario ")
	private Long hospes_funcionario ;
	
	@Column(name ="os_dataemis_ ")
	private Long os_dataemis_ ;
	
	@Column(name ="os_datafech ")
	private Long os_datafech;
	
	@Column(name ="os_status ")
	private Long os_status ;
	@Column(name ="os_descricao ")
	private Long os_descricao ;
	@Column(name ="os_local ")
	private Long os_local ;
	public Long getOs_id() {
		return os_id;
	}
	public void setOs_id(Long os_id) {
		this.os_id = os_id;
	}
	public Long getOsts_id() {
		return osts_id;
	}
	public void setOsts_id(Long osts_id) {
		this.osts_id = osts_id;
	}
	public Long getOsh_id() {
		return osh_id;
	}
	public void setOsh_id(Long osh_id) {
		this.osh_id = osh_id;
	}
	public Long getOsh_funcionario() {
		return osh_funcionario;
	}
	public void setOsh_funcionario(Long osh_funcionario) {
		this.osh_funcionario = osh_funcionario;
	}
	public Long getOs_ordemservico() {
		return os_ordemservico;
	}
	public void setOs_ordemservico(Long os_ordemservico) {
		this.os_ordemservico = os_ordemservico;
	}
	public Long getOspes_id_() {
		return ospes_id_;
	}
	public void setOspes_id_(Long ospes_id_) {
		this.ospes_id_ = ospes_id_;
	}
	public Long getOspes_cliente_() {
		return ospes_cliente_;
	}
	public void setOspes_cliente_(Long ospes_cliente_) {
		this.ospes_cliente_ = ospes_cliente_;
	}
	public Long getHospes_funcionario() {
		return hospes_funcionario;
	}
	public void setHospes_funcionario(Long hospes_funcionario) {
		this.hospes_funcionario = hospes_funcionario;
	}
	public Long getOs_dataemis_() {
		return os_dataemis_;
	}
	public void setOs_dataemis_(Long os_dataemis_) {
		this.os_dataemis_ = os_dataemis_;
	}
	public Long getOs_datafech() {
		return os_datafech;
	}
	public void setOs_datafech(Long os_datafech) {
		this.os_datafech = os_datafech;
	}
	public Long getOs_status() {
		return os_status;
	}
	public void setOs_status(Long os_status) {
		this.os_status = os_status;
	}
	public Long getOs_descricao() {
		return os_descricao;
	}
	public void setOs_descricao(Long os_descricao) {
		this.os_descricao = os_descricao;
	}
	public Long getOs_local() {
		return os_local;
	}
	public void setOs_local(Long os_local) {
		this.os_local = os_local;
	}
	
}