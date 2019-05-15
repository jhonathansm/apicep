package com.enderecos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class EnderecosModel {
	
	@Id
	private String cep;
	@NotNull
	private String endereco;
	@NotNull
	private String bairro;
	@NotNull
	private String cidade;
	@NotNull
	private String uf;
	@NotNull
	private String pais;
	
	
	public String getCep() {
		return cep;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public String getPais() {
		return pais;
	}
	
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
}
