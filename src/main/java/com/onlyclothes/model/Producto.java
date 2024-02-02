package com.onlyclothes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue
	private Integer Id;
	private String Nombre;
	private String Descripcion;
	private String Imagen;
	private double Precio;
	private int Cantidad;
	
	@ManyToOne
	private Usuario usuario;
	
	public Producto() {
		
	}

	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad,
			Usuario usuario) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		Imagen = imagen;
		Precio = precio;
		Cantidad = cantidad;
		this.usuario = usuario;
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
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Imagen=" + Imagen
				+ ", Precio=" + Precio + ", Cantidad=" + Cantidad + ", usuario=" + usuario + "]";
	}

}
