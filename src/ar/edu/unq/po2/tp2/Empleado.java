package ar.edu.unq.po2.tp2;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private int edad;
	private int sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, int edad, int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
		this.sueldoBasico = sueldoBasico;
	}
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
