package ar.edu.unq.po2.tp2;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, int edad,int sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, edad,sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	public int sueldoBruto() {
		int sueldoTotal = this.cantidadDeHijos * 150 + this.antiguedad * 50;
		if (this.getEstadoCivil() == "Casado") {
			sueldoTotal += 100;
		}
		return (sueldoTotal + this.getSueldoBasico());
	}
	public int retenciones() {
		int sueldoRestante = ((this.sueldoBruto() * 25) / 100) - 20 * this.cantidadDeHijos;
		return sueldoRestante;
	}
}
