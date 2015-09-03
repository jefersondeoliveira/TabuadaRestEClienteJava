package br.com.tabuada.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

	private List<String> tabuada;
	
	public Response() {
		this.tabuada = new ArrayList<>();
	}
	
	public List<String> getTabuada() {
		return this.tabuada;
	}

	public void add(String valor) {
		this.tabuada.add(valor);
	}

	public void setTabuada(List<String> tabuada) {
		this.tabuada = tabuada;
	}
	
}
