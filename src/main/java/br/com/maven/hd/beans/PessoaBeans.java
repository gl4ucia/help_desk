package br.com.maven.hd.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class PessoaBeans {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="pes_id")
private Long pes_id;
@Column(name = "pes_nome")
private String pes_nome;
@Column(name = "pes_cpf")
private String pes_cpf;
@Column(name = "pes_datanasc")
private String pes_datanasc;
@Column(name = "pes_uf")
private char pes_uf;
@Column(name = "pes_cidade")
private String pes_cidade;
@Column(name = "pes_email")
private String email;
@Column(name = "pes_senha")
private String pes_senha;
@Column(name = "pes_tipo")
private String tipo;
@Column(name = "pes_fone1")
private String pes_fone1;
@Column(name = "pes_fone2")
private String pes_fone2;


public Long getPes_id() {
	return pes_id;
}
public void setPes_id(Long pes_id) {
	this.pes_id = pes_id;
}
public String getPes_nome() {
	return pes_nome;
}
public void setPes_nome(String pes_nome) {
	this.pes_nome = pes_nome;
}
public String getPes_cpf() {
	return pes_cpf;
}
public void setPes_cpf(String pes_cpf) {
	this.pes_cpf = pes_cpf;
}
public String getPes_datanasc() {
	return pes_datanasc;
}
public void setPes_datanasc(String pes_datanasc) {
	this.pes_datanasc = pes_datanasc;
}
public char getPes_uf() {
	return pes_uf;
}
public void setPes_uf(char pes_uf) {
	this.pes_uf = pes_uf;
}
public String getPes_cidade() {
	return pes_cidade;
}
public void setPes_cidade(String pes_cidade) {
	this.pes_cidade = pes_cidade;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPes_senha() {
	return pes_senha;
}
public void setPes_senha(String pes_senha) {
	this.pes_senha = pes_senha;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPes_fone1() {
	return pes_fone1;
}
public void setPes_fone1(String pes_fone1) {
	this.pes_fone1 = pes_fone1;
}
public String getPes_fone2() {
	return pes_fone2;
}
public void setPes_fone2(String pes_fone2) {
	this.pes_fone2 = pes_fone2;
} 
}
