package com.onlyclothes.model;

public class Producto {
	
	private Integer Id;
	private String Nombre;
	private String Descripcion;
	private String Imagen;
	private double Precio;
	private int Cantidad;
	
	public Producto() {
	}

	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Imagen = imagen;
		Precio = precio;
		Cantidad = cantidad;
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

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Imagen=" + Imagen
				+ ", Precio=" + Precio + ", Cantidad=" + Cantidad + "]";
	}
	
	
}
