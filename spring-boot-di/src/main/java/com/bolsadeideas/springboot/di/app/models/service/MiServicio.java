package com.bolsadeideas.springboot.di.app.models.service;

//@Primary
//@Component("miServicioSimple")//se puede añadir nombres a los component o services
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		
		return "ejecutando algun proceso importante SIMPLE";
	}

	
}
