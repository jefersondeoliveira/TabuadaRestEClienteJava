package br.com.tabuada.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tabuada.request.Request;
import br.com.tabuada.response.Response;


@Path("tabuada")
public class TabuadaService 
		implements ITabuadaService{

	
	@Override
	@POST
	@Path("getTabuada")
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getTabuada(Request request) {
		
		Response response = new Response();
		
		for(int i = 0; i <= 10; i++){ 
			response.add(request.getNumero()+" * "+i+" = "+(request.getNumero()*i));
		}  
				
		return response;
	}
	
	@Override
	@GET
	@Path("teste")
	public String mensagem() {
		return "Servico REST";
	}

}
