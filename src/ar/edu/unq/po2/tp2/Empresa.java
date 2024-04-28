package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class Empresa {
	private String empresa;
	private int cuit;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String empresa, int cuit) {
		super();
		this.empresa = empresa;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}
