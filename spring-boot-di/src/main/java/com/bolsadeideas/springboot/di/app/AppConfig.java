package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Primary
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto p1 = new Producto("Camara",100);
		Producto p2 = new Producto("Bicicleta",200);
		
		ItemFactura linea1 = new ItemFactura(p1, 2);
		ItemFactura linea2 = new ItemFactura(p2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Primary
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto p1 = new Producto("Monitor LG",250);
		Producto p2 = new Producto("Notebook Asus",500);
		Producto p3 = new Producto("Impresora HP",80);
		Producto p4 = new Producto("Escritorio Oficina",300);
		
		ItemFactura linea1 = new ItemFactura(p1, 2);
		ItemFactura linea2 = new ItemFactura(p2, 1);
		ItemFactura linea3 = new ItemFactura(p3, 1);
		ItemFactura linea4 = new ItemFactura(p4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
