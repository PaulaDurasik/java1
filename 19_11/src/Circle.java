
public class Circle {
	private int r;
	private Point center;
	
	public Circle() {
		this.r = 0;
		this.center = new Point();
	}
	
	public Circle(int r) {
		this.r = r;
		this.center = new Point();
	}
	
	public Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}
	
	public Circle(int r, int x, int y) {
		this.r = r;
		this.center = new Point(x, y);
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public boolean isInCircle(int x, int y) {
		return (center.getRealDistance(x, y) <= this.r);
	}
	
	public boolean isInCircle(Point p) {
		return (center.getRealDistance(p) <= this.r);
	}
	
}
