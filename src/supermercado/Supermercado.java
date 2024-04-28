package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	public double getPrecioTotal() {
		double precioTotal = 0d;
		for (Producto p : this.productos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
}
