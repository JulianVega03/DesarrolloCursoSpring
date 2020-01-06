package com.bolsadeideas.springboot.app.util.paginator;

public class PageItem {
	
	private int numero;
	private boolean esActual;
	
	
	public PageItem(int numero, boolean esActual) {
		this.numero = numero;
		this.esActual = esActual;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isEsActual() {
		return esActual;
	}
	public void setEsActual(boolean esActual) {
		this.esActual = esActual;
	}
	
	
	

}
