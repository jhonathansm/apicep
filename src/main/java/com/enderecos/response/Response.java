package com.enderecos.response;

public class Response {

	private String status;
	private String mensagem;
	
	public Response(String status) {
		this.status = status;
	}
	
	public Response(String status, String mensagem) {
		this.status = status;
		this.mensagem = mensagem;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
