package zad2;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private static String[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			return true;
		}
		return false;
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		boolean ret = true;
		if(year < 0 || year > 9999) ret = false;
		if(month < 1 || month > 12) ret = false;
		if(month == 2) {
				ret = MyDate.isLeapYear(year) ? (day >= 1 && day <= 29) : (day >= 1 && day <= 28);
		} else {
			if(month >= 1 && month <= 12 && (day < 1 || day > MyDate.daysInMonths[month - 1])) ret = false;
		}
		
		return ret;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
		if(isLeapYear(year)) {
	    	t[0] = 6;
	    	t[1] = 2;
	    }
	    return (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;		
	}

	@Override
	public String toString() {
		return MyDate.strDays[ MyDate.getDayOfWeek(this.year, this.month, this.day) ] + " " + this.day + " " + MyDate.strMonths[this.month - 1] + " " + this.year;
	}
	
	
}
