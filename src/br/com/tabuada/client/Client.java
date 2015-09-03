package br.com.tabuada.client;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

import com.google.gson.Gson;

import br.com.tabuada.request.Request;
import br.com.tabuada.response.Response;

public class Client {

	public static void main(String[] args) {
		
		for (String valor : tabuada(5)) {
			System.out.println(valor);
		}
		
	}
	
	public static List<String> tabuada(int a){
		
		WebClient client = WebClient.create("http://localhost:8080/tabuada/api/tabuada/getTabuada")
				.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON);
		
		Request request = new Request();
		request.setNumero(a);
		
		String json =new Gson().toJson(request);
		System.out.println("Json: "+json);
		
		String jsonRetorno = client.post(json, String.class);
		
		System.out.println("Resposta: "+jsonRetorno);
		
		Response response = new Gson().fromJson(jsonRetorno, Response.class);
		
		
		return response.getTabuada();
		
	}
	
	public static String mensagem(){
		
		WebClient client = WebClient.create("http://localhost:8080/tabuada/api/tabuada/teste")
				.accept(MediaType.TEXT_PLAIN);
		
		return client.get(String.class);
	
	}

}
