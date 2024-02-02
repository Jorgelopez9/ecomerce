package com.onlyclothes.model;

public class Usuario {
	
	private Integer Id;
	private String Nombre;
	private String UserName;
	private String Email;
	private String Direccion;
	private String Telefono;
	private String Tipo;
	private String Password;
	
	
	public Usuario() {
	
	}
	
	public Usuario(Integer id, String nombre, String userName, String email, String direccion, String telefono,
			String tipo, String password) {
		super();
		Id = id;
		Nombre = nombre;
		UserName = userName;
		Email = email;
		Direccion = direccion;
		Telefono = telefono;
		Tipo = tipo;
		Password = password;
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
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nombre=" + Nombre + ", UserName=" + UserName + ", Email=" + Email
				+ ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Tipo=" + Tipo + ", Password=" + Password
				+ "]";
	}
	
}
