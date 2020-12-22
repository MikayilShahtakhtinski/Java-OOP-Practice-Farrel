package CallPhone;

abstract class PhoneCall{
	protected String number;
	protected double price;
	public PhoneCall(String number) {
		this.number = number;
		this.price = 0.0;
	}
	public void setPrice() {
		this.price = 0;
	}
	public abstract String getNumber();
	public abstract double getPrice();
	public abstract String getDisplay();
}
class IncomingPhoneCall extends PhoneCall{

	public IncomingPhoneCall(String number) {
		super(number);
		this.price = 0.02d;
	}

	@Override
	public String getNumber() {
		return this.number;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String getDisplay() {
		return "Number: "+this.getNumber()+",Rate: "+this.getPrice()+",Price: "+ this.getPrice();
	}	
}
class OutgoingPhoneCall extends PhoneCall{
	private double minutes;
	public OutgoingPhoneCall(String number, double minutes) {
		super(number);
		this.minutes = minutes;
		this.price = this.minutes * 0.04d;
	}
	@Override
	public String getNumber() {
		return this.number;
	}
	@Override
	public double getPrice() {
		return this.price;
	}
	@Override
	public String getDisplay() {
		return "Number: "+this.getNumber()+",Rate: 0.04"+",Minutes: "+ this.minutes+",Total price: "+ this.getPrice(); 
	}
	
}
public class callingphone {

	public static void main(String[] args) {
		IncomingPhoneCall call = new IncomingPhoneCall("+994558201103");
		System.out.println(call.getDisplay());
		OutgoingPhoneCall call2 = new OutgoingPhoneCall("+1 704 12 12", 60);
		System.out.println(call2.getDisplay());
		
		
	}

}

