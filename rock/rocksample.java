package rock;
class Rock{
	private int NumberOfSamples;
	protected String Discription;
	private double Weigth;
	public Rock(int NumberOfSamples, double weight) {
		this.NumberOfSamples = NumberOfSamples;
		this.Weigth = weight;
		this.Discription = "Unclassified";
	}
	public int getNumberOfSamples() {
		return NumberOfSamples;
	}
	public String getDiscription() {
		return Discription;
	}
	public double getWeigth() {
		return Weigth;
	}
	
}
class IgneousRock extends Rock{
	public IgneousRock(int NumberOfSamples, double weight) {
		super(NumberOfSamples,weight);
		this.Discription = "any of various crystalline or glassy rocks formed by the cooling";	
	}
	
}
class SedimentaryRock extends Rock{
	public SedimentaryRock(int NumberOfSamples, double weight) {
		super(NumberOfSamples,weight);
		this.Discription = "Ligth blue rock";	
	}
	
}
class MetamorphicRock extends Rock{
	public MetamorphicRock(int NumberOfSamples, double weight) {
		super(NumberOfSamples,weight);
		this.Discription = "Red rock";
	}
	
}
public class rocksample {

	public static void main(String[] args) {
		MetamorphicRock metamorphicRock = new MetamorphicRock(12, 12.5d);
		System.out.println(metamorphicRock.getDiscription()+", with weight of:  "+ metamorphicRock.getWeigth());
	}

}
