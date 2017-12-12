package zad3;

public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		this.y += 1;
		
	}

	@Override
	public void moveDown() {
		this.y -= 1;		
	}

	@Override
	public void moveLeft() {
		this.x -= 1;		
	}

	@Override
	public void moveRight() {
		this.x += 1;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	
}
