package br.com.tabuada.service;

import br.com.tabuada.request.Request;
import br.com.tabuada.response.Response;

public interface ITabuadaService {
	
	public Response getTabuada(Request request);
	
	public String mensagem();
	
}
