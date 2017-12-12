package zad7;

public class XMLCounter {
	public double countAverage(String filename, int a, int b) {
		int counter = 0;
		double sum = 0;
		for(int i = a; i <= b; i++) {
			filename = filename.replace("[n]", i + "");
			double[] d = Helper.readDoublesFromXML(filename);
			sum += this.sumDoubles( d );
			counter += d.length;
		}
		
		return sum / counter;
	} 
	
	private double sumDoubles(double[] doubles) {
		double sum = 0.0;
		for(int i = 0; i < doubles.length; i++) {
			sum += doubles[i];
		}
		return sum;
	}
}
