import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipo;
	
	@BeforeEach
	public void setUp() throws Exception {
	equipo = new EquipoDeTrabajo("Team");
	Persona pepe = new Persona("pepe", "pepe", 20);
	Persona pipi = new Persona("pipi", "pipi", 30);
	Persona papa = new Persona("papa", "papa", 40);
	Persona pupu = new Persona("pupu", "pupu", 50);
	Persona pope = new Persona("pope", "pope", 80);
	
	equipo.agregarPersonaAEquipo(pepe);
	equipo.agregarPersonaAEquipo(pipi);
	equipo.agregarPersonaAEquipo(papa);
	equipo.agregarPersonaAEquipo(pupu);
	equipo.agregarPersonaAEquipo(pope);
	}
	@Test
	void test() {
		System.out.print(equipo.edadPromedio()); ;
	}

}
