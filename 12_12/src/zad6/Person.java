package zad6;

public class Person {
	private String name; 
	private String lastname; 
	private String company; 
	private double salary; 
	private String department; 
	private int yearOfBorn;
	
	public Person() {}
	
	public Person(String name, String lastname, String company, double salary, String department, int yearOfBorn) {
		this.name = name;
		this.lastname = lastname;
		this.company = company;
		this.salary = salary;
		this.department = department;
		this.yearOfBorn = yearOfBorn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfBorn() {
		return yearOfBorn;
	}

	public void setYearOfBorn(int yearOfBorn) {
		this.yearOfBorn = yearOfBorn;
	}
	
	
}
