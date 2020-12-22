package Catering;
class Event{
	public final static double LowerPricePerGuest = 32;
	public final static double HigherPricePerGuest = 35;
	public final static double Cutoff = 50;
	public final static String IventTypesName[] = {"wedding", "baptism","birthday","corporate","other"};
	
	private String EventNumber;
	private int guest;
	private double price;
	private double pricePerGuest;
	private String ContactPhoneNumber;
	private int EventTypeNumber;
	
	public void setEventTypeNumber(int number) {
		if(number>IventTypesName.length) {
			this.EventTypeNumber = 4;
		}else {
			this.EventTypeNumber = number;
		}
	}
	public String getEventTypeNumber() {
		return IventTypesName[EventTypeNumber];
	}
	
	public String getContactNumber() {
		return EventNumber;
	}
	public boolean isLargeEvent() {
		if(this.guest>50) {
			return true;
		}else {
			return false;
		}
	}
	public String getContactPhoneNumber() {
		return "("+ContactPhoneNumber.substring(0,3)+") "+ContactPhoneNumber.substring(3,6)+"-"+ContactPhoneNumber.substring(6);
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		String s = "";
		int count= 0;
		for (int i = 0; i < contactPhoneNumber.length(); i++) {
		    if (Character.isDigit(contactPhoneNumber.charAt(i))) {
		        count++;
		        s+= contactPhoneNumber.charAt(i);
		    }
		}
		if(count==10) {
			ContactPhoneNumber = s;
		}else {
			ContactPhoneNumber = "0000000000";
		}
	}
	public void setEventNumber(String EventNumber) {
		if(EventNumber.length()!=4 || !EventNumber.matches("[A-Z][0-9][0-9][0-9]")) {
			this.EventNumber = "A000";
		}else {
			this.EventNumber = EventNumber;
		}
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
		if(isLargeEvent()) {
			this.pricePerGuest = LowerPricePerGuest;
			this.price = this.pricePerGuest*guest;
		}else{
			this.pricePerGuest = HigherPricePerGuest;
			this.price = this.pricePerGuest*guest;
			
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Event(String EventNumber, int guest, String contactnumber ) {
		setEventNumber(EventNumber);
		setGuest(guest);
		setContactPhoneNumber(contactnumber);
	}
	public Event() {
		this("A000", 0, "0000000000" );
		
	}
	public Event(String EventNumber, int guest) {
		setEventNumber(EventNumber);
		setGuest(guest);	
	}
	public double getPricePerGuest() {
		return pricePerGuest;
	}
	public void setPricePerGuest(double pricePerGuest) {
		this.pricePerGuest = pricePerGuest;
	}
}
class DinnerEvent extends Event{
	private int entree;
	private int side_dish1;
	private int side_dish2;
	private int dessert;
	private final String[] entrees = {"water","soda","sok"};
	private final String[] side_dishes = {"ikra","zeytun","xiyar"};
	private final String[] desserts = {"tort-mars","wokolad-blin","nutella-blin"};
	public DinnerEvent(String EventNumber, int guest, int entree, int side_dish1, int side_dish2, int dessert) {
		super(EventNumber,guest);
		this.entree = entree;
		this.side_dish1 = side_dish1;
		this.side_dish2 = side_dish2;
		this.dessert = dessert;
	}
	public String getMenu() {
		return "Entree is: "+this.entrees[entree] + " ,Side Dish#1: "+ this.side_dishes[side_dish1]+ " ,Side Dish#2:" + this.side_dishes[side_dish2] + " and finally dessert: "+ this.desserts[dessert];
	}
}
public class CarlyCatering {

	public static void main(String[] args) {
		Event event2 = new Event("B123", 30, "(920) 872-9182");
		System.out.println("Event Num: "+event2.getContactNumber()+" Guests: "+event2.getGuest()+", price: " + event2.getPrice() + " contact number : "+ event2.getContactPhoneNumber());
		DinnerEvent dinner = new DinnerEvent("B124", 4, 1, 0, 2, 1);
		System.out.println(dinner.getMenu());
		
	}

}
