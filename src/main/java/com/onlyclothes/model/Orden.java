package com.onlyclothes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Table(name = "ordenes")
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Numero;
	private Date FechaCreacion;
	private Date FechaRecivida;
	private double Total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	public Orden() {
		
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecivida, double total) {
		super();
		Id = id;
		Numero = numero;
		FechaCreacion = fechaCreacion;
		FechaRecivida = fechaRecivida;
		Total = total;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public Date getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public Date getFechaRecivida() {
		return FechaRecivida;
	}

	public void setFechaRecivida(Date fechaRecivida) {
		FechaRecivida = fechaRecivida;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [Id=" + Id + ", Numero=" + Numero + ", FechaCreacion=" + FechaCreacion + ", FechaRecivida="
				+ FechaRecivida + ", Total=" + Total + "]";
	}
	
	
}
