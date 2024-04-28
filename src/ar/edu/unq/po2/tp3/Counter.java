package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> lista;

	public Counter() {
		lista = new ArrayList<Integer>();
	}
	public void addNumber(Integer x) {
		lista.add(x);
	}
	public int getEvenOcurrences() {
        int pares = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
	public int getOddOcurrences() {
        int impares = 0;
        for (int num : lista) {
            if (num % 2 != 0) {
            	impares++;
            }
        }
        return impares;
    }
	public int multiplesOf(int numero) {
 		int multiplos = 0;
        for (int num : lista) {
            if (num % numero == 0) {
            	multiplos++;
            }
        }
        return multiplos;
	}
	public int multMasGrande(int x,int y) {
		for (int i=1000; i>0; i--) {
			if (i % x == 0 && i % y == 0) {
				return i;
			}
		}
		return -1;
	}
}
	
