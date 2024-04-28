package supermercado;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	public Producto(String nombre, double precio, boolean bool) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = bool;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCiudado(boolean esPrecioCiudado) {
		this.esPrecioCuidado = esPrecioCiudado;
	}
	public void aumentarPrecio(double n) {
		this.precio += n;
	}
}
