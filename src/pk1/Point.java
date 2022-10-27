package pk1;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void affiche() {
		System.out.print(" [ " + x + ", " + y + "] ");
	}
	
	public int calculerSomme() {
		return x+y;
	}

}
