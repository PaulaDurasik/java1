package zad1;

public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public MyTime() {}
	
	public MyTime(int hour, int minute, int second) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		if(minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
	}
	
	public void setTime(int hour, int minute, int second) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		if(minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		if(second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	@Override
	public String toString() {
		String ret = "";
		if(this.hour < 10) {
			ret += "0";
		}
		ret += this.hour + ":";
		if(this.minute < 10) {
			ret += "0";
		}
		ret += this.minute + ":";
		if(this.second < 10) {
			ret += "0";
		}
		ret += this.second;
		
		return ret;
	}
	
	public MyTime nextHour() {
		int hour = (this.hour == 23) ? 0 : this.hour + 1;
		return new MyTime(hour, this.minute, this.second);
	}
	
	public MyTime nextMinute() {
		int minute = (this.minute == 59) ? 0 : this.minute + 1;
		int hour = (minute == 0) ? this.hour + 1 : this.hour;
		if(minute == 0) hour = (this.hour == 24) ? 0 : this.hour + 1; 
		return new MyTime(hour, minute, this.second);
	}
	
	public MyTime nextSecond() {
		int second = (this.second == 59) ? 0 : this.second + 1;
		int minute = (second == 0) ? this.minute + 1 : this.minute;
		int hour = (minute == 0) ? this.hour + 1 : this.hour;
		
		if(minute == 60) {
			minute = 0;
			hour = (this.hour == 24) ? 0 : this.hour + 1; 
		} 
		return new MyTime(hour, minute, second);
	}
	
	public MyTime prevHour() {
		int hour = (this.hour == 0) ? 23 : this.hour - 1;
		return new MyTime(hour, this.minute, this.second);
	}
	
	public MyTime prevMinute() {
		int minute = (this.minute == 0) ? 59 : this.minute - 1;
		int hour = (minute == 59) ? this.hour - 1 : this.hour;
		if(this.minute == 0) hour = (this.hour == 0) ? 23 : this.hour - 1; 
		return new MyTime(hour, minute, this.second);
	}
	
	public MyTime prevSecond() {
		int second = (this.second == 0) ? 59 : this.second - 1;
		int minute = (second == 59) ? this.minute - 1 : this.minute;
		int hour = (minute == 0) ? this.hour - 1 : this.hour;
		
		if(minute <= 0) {
			minute = 59;
			hour = (this.hour == 0) ? 23 : this.hour - 1; 
		} 
		return new MyTime(hour, minute, second);
	}
}
