package com.escuela.usuario.valido.Controller;
public class Vehiculo {
	public Vehiculo() {
		super();
	}
	private String mod;
	private Integer precio;
	private String marca;
	private String color;
	
	public Vehiculo(String mod, Integer precio, String marca, String color,  Integer año) {
		this.mod = mod;
		this.precio = precio;
		this.marca = marca;
		this.color = color;

		this.año = año;
	}
	private Integer año;
	
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setprecio(Integer precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	

}