import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.Empleado;
import ar.edu.unq.po2.tp2.Empresa;

import java.util.ArrayList;

class EmpresaTest {
	
	private Empresa empresa;
	private Empleado emp1;
	private Empleado emp2;
	private Empleado emp3;
	private Empleado emp4;
	private Empleado emp5;
	
	@BeforeEach
	public void setUp() throws Exception {
	empresa = new Empresa("Emp", 4);
	empresa.agregarEmpleado(emp1);
	empresa.agregarEmpleado(emp2);
	empresa.agregarEmpleado(emp3);
	empresa.agregarEmpleado(emp4);
	empresa.agregarEmpleado(emp5);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
