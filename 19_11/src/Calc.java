
public class Calc {
	private double result = 0;
	private String[] log = new String[5];
	
	public double add(double n) {
		this.addToLog(this.result + " + " + n + " = " + (this.result+n));
		this.result = this.result + n;
		return this.result;
	}
	
	public double substract(double n) {
		this.result = this.result - n;
		return this.result;
	}
	
	public double multiply(double n) {
		this.result = this.result * n;
		return this.result;
	}
	
	public double power(double n) {
		double tempRes = this.result;
		if(n == 0) {
			this.result = 1;
		} else if(n > 1) {
			for(int i = 2; i <= n; i++) {
				this.result = this.result * tempRes;
			}
		}
		
		return this.result;
	}
	
	public double division(double n) {
		this.result = this.result / n;
		return this.result;
	}
	
	public void clear() {
		this.result = 0;
	}
	
	public void addToLog(String log) {
		for(int i = this.log.length - 1; i >= 1; i--) {
			this.log[i] = this.log[i - 1];
		}
		this.log[0] = log;
	}
	
	public void showLog() {
		for(int i = 0; i < this.log.length; i++) {
			System.out.println(this.log[i]);
		}
	}
}
