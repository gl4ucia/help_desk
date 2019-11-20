package br.com.maven.hd.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoServico")
public class TipoServicoBeans {
	@Column(name ="ts_id")
	private Long ts_id;
	@Column(name = "tp_desc")
	private String tp_desc;
	
	public Long getTs_id() {
		return ts_id;
	}
	public void setTs_id(Long ts_id) {
		this.ts_id = ts_id;
	}
	public String getTp_desc() {
		return tp_desc;
	}
	public void setTp_desc(String tp_desc) {
		this.tp_desc = tp_desc;
	}
	
	
	
	
}
