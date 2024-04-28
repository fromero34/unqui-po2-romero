import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTestCase {
	private Point point;
	private Point point2;
	private Point point3;
	
	@BeforeEach
	public void setUp() throws Exception {
		point = new Point(1,2);
		point2 = new Point(1,2);
		point3 = sumarPuntos(point2, point);
	}
	
	private Point sumarPuntos(Point p, Point p2) {
		int x = p.getX() + p2.getX();
		int y = p.getY() + p2.getY();
		Point nuevoPunto = new Point(x,y);
		return nuevoPunto;
	}
	
	@Test
	void test() {
		assertEquals(point3.getX(),2);
		assertEquals(point3.getY(),4);
	}

}
