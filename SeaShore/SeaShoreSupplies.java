package SeaShore;
class SeaShore {
	public final static int minutes = 60;
	public final static double rental_rate = 40;
	
	private String ContactNumber;
	private int hours;
	private int minutesOverhour;
	private double price;
	
	public SeaShore(String number, int minutes) {
		setContactNumber(number);
		setMinutesOverhour(minutes);
	}
	public SeaShore() {
		ContactNumber = "A000";
		minutesOverhour = 0;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutesOverhour() {
		return minutesOverhour;
	}
	public void setMinutesOverhour(int minutesOverhour) {
		this.minutesOverhour = minutesOverhour;
		price = rental_rate*(minutesOverhour/minutes);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
public class SeaShoreSupplies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
