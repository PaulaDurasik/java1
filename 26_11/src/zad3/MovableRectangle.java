package zad3;

public class MovableRectangle implements Movable {

	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	
	@Override
	public void moveUp() {
		this.topLeft.y += 1;
		this.bottomRight.y += 1;
	}

	@Override
	public void moveDown() {
		this.topLeft.y -= 1;
		this.bottomRight.y -= 1;
	}

	@Override
	public void moveLeft() {
		this.topLeft.x -= 1;
		this.bottomRight.x -= 1;
	}

	@Override
	public void moveRight() {
		this.topLeft.x += 1;
		this.bottomRight.x += 1;
	}

	@Override
	public String toString() {
		return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	}
	
	

}
