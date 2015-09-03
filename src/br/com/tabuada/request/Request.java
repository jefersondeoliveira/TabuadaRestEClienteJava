package br.com.tabuada.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Request {

	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	
}
