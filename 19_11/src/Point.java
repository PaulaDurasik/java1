
public class Point {
	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public Point(int[] args) {
		this.x = args[0];
		this.y = args[1];
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
	
	public void addX(int x) {
		this.x += x; 
	}
	
	public void addY(int y) {
		this.y += y;
	}
	
	public void move(int x, int y) {
		this.addX(x);
		this.addY(y);
	}
	
	public void moveUpLeft() {
		this.move(-1, 1);
	}
	
	public void moveUpRight() {
		this.move(1, 1);
	}
	
	public void moveDownLeft() {
		this.move(-1, -1);
	}
	
	public void moveDownRight() {
		this.move(1, -1);
	}
	
	public void moveLeft() {
		this.move(-1, 0);
	}
	
	public void moveRight() {
		this.move(1, 0);
	}
	
	public void moveUp() {
		this.move(0, 1);
	}
	
	public void moveDown() {
		this.move(0, -1);
	}
	
	public int[] getDistance(int x, int y) {
		int[] ret = new int[2];
		ret[0] = Math.abs(this.x - x);
		ret[1] = Math.abs(this.y - y);
		return ret;
	}
	
	public double getRealDistance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	public double getRealDistance(Point p) {
		return Math.sqrt( Math.pow(this.x - p.getX(), 2) +
						  Math.pow(this.y - p.getY(), 2) );
	}
}
