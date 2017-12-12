package zad8;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpence;
	private double productExpence;
	
	public Visit(String name, Date date) {
		this.customer = new Customer(name);
		this.date = date;
	}
	
	public String getName() {
		return this.customer.getName();
	}

	public double getServiceExpence() {
		return serviceExpence;
	}

	public void setServiceExpence(double serviceExpence) {
		this.serviceExpence = serviceExpence - (serviceExpence * DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));
	}

	public double getProductExpence() {
		return productExpence;
	}

	public void setProductExpence(double productExpence) {
		this.productExpence = productExpence - (productExpence * DiscountRate.getProductDiscountRate(this.customer.getMemberType()));
	}
	
	public double getTotalExpence() {
		return this.productExpence + this.serviceExpence;
	}
}
