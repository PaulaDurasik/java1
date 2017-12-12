package zad8;

public class DiscountRate {
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type) {
		if(type.equalsIgnoreCase("premium")) {
			return DiscountRate.serviceDiscountPremium;
		} else if(type.equalsIgnoreCase("gold")) {
			return DiscountRate.serviceDiscountGold;
		} else if(type.equalsIgnoreCase("silver")) {
			return DiscountRate.serviceDiscountSilver;
		} else {
			return 0;
		}
	}
	
	public static double getProductDiscountRate(String type) {
		if(type.equalsIgnoreCase("premium")) {
			return DiscountRate.productDiscountPremium;
		} else if(type.equalsIgnoreCase("gold")) {
			return DiscountRate.productDiscountGold;
		} else if(type.equalsIgnoreCase("silver")) {
			return DiscountRate.productDiscountSilver;
		} else {
			return 0;
		}
	}
}
