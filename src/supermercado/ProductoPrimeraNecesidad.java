package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio * 0.9, esPrecioCuidado);
	}
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int descuento) {
		super(nombre, precio - (precio / descuento), esPrecioCuidado);
	}
}
