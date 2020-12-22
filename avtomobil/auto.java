package avtomobil;
class AutoMobile{
	private int ID;
	private String make;
	private String model;
	private String color;
	private int year;
	private double MilesPerGalon;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		if(ID>=0 && ID<=9999) {
			this.ID = ID;
		}else {
			this.ID = 0;
		}
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>=2005 && year<=2019) {
			this.year = year;
		}else {
			this.year=0;	
		}
		
	}
	public double getMilesPerGalon() {
		return MilesPerGalon;
	}
	public void setMilesPerGalon(double milesPerGalon) {
		if(milesPerGalon>=10 && milesPerGalon<=60) {
			this.MilesPerGalon = milesPerGalon;
		}else {
			this.MilesPerGalon = 0;
		}
	}
	public AutoMobile(int iD, String make, String model, String color, int year, double milesPerGalon) {
		super();
		setID(iD);
		this.make = make;
		this.model = model;
		this.color = color;
		setYear(year);
		setMilesPerGalon(milesPerGalon);
	}
	
	public String toString() {
		return "Model : "+ this.model + ", make :"+ this.make+ ", ID: "+ this.ID + ", Galons: " + this.MilesPerGalon + ", year: "+ this.year + ", color : "+ this.color;
	}
}
public class auto {

	public static void main(String[] args) {
		AutoMobile automobile1 =new AutoMobile(12, "BMW", "M6", "red", 2017, 75);
		System.out.println(automobile1.toString());
	}

}
