package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad lechePromo;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		lechePromo = new ProductoPrimeraNecesidad("Leche", 8d, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d , leche.getPrecio());
		assertEquals(7.7d , lechePromo.getPrecio());
	}
}
