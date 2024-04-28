package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import ar.edu.unq.po2.tp3.Persona;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> personas;
	
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.personas = new ArrayList<Persona>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int edadPromedio() {
		int edadTotal = 0;
		int personas = 0;
		for (Persona p : this.personas) {
			edadTotal += p.getEdad();
			personas +=1;
		}
		return edadTotal / personas;
	}
	public void agregarPersonaAEquipo(Persona p) {
		this.personas.add(p);
	}
}
