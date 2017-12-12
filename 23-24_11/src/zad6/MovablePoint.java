package zad6;

public class MovablePoint extends Point {
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	
	public MovablePoint() {
		super();
	}
	
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		
	}
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed() {
		float[] ret = { this.xSpeed, this.ySpeed };
		return ret;
	}
	
	public MovablePoint move() {
		super.setX(super.getX() + this.xSpeed);
		super.setY(super.getY() + this.ySpeed);
		return this;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + "), xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed;
	}
	
}
