import ar.edu.unq.po2.tp3.Counter;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
 	@Test
	/* TEST-1-COUNTER */
	public void testEvenNumbers() {
		int amount = counter.multiplesOf(3);
		
		assertEquals(amount,2);
	} 
 	
 	/* TEST-3-MULTIPLO
 	public void test() {
 		int n = multMasGrande(27,52);
 		 
 		assertEquals(n,-1);
 	}
 	public void test() {
		String a = "abc";
		String s = a;
		String t;
 		System.out.print(a.substring(1,3).equals("bc"));
 	} */
}
/* TEST-4-RESULTADOS
 * System.out.print(s.length()); = 3
 * System.out.print(t.length()); = error "No inicializada"
 * System.out.print(1 + a); = 1abc
 * System.out.print(a.toUpperCase()); = ABC
 * System.out.print("Libertad".indexOf("r")); = 4
 * System.out.print("Universidad".lastIndexOf("i")); = 7
 * System.out.print("Quilmes".substring(2,4)); = il
 * System.out.print((a.length() + a).startsWith("a")); = false
 * System.out.print(s == a); = true 
 * System.out.print(a.substring(1,3).equals("bc")); = true */
