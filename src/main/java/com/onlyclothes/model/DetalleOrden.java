package com.onlyclothes.model;

public class DetalleOrden {
	private Integer Id;
	private String Nombre;
	private double Cantidad;
	private double Precio;
	private double Total;
	
	public DetalleOrden() {
	}

	public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
		super();
		Id = id;
		Nombre = nombre;
		Cantidad = cantidad;
		Precio = precio;
		Total = total;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(double cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [Id=" + Id + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", Precio=" + Precio
				+ ", Total=" + Total + "]";
	}
	
	

}
