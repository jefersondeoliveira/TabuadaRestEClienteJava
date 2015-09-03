package br.com.tabuada.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.tabuada.service.TabuadaService;

@ApplicationPath("api")
public class ApplicationConfig
	extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> recursos
			= new HashSet<>();
		
		recursos.add(TabuadaService.class);
		
		return recursos;
		
		
	}

	
	
}
