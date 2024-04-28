package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void movePoint(Point p, int x, int y) {
		p.setX(x);
		p.setX(y);
	}
	
	public Point sumarPuntos(Point p, Point p2) {
		int x = p.getX() + p2.getX();
		int y = p.getY() + p2.getY();
		Point nuevoPunto = new Point(x,y);
		return nuevoPunto;
	}
}
