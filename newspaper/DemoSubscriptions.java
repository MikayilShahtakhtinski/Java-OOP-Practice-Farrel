package newspaper;
abstract class NewspaperSubscription{
	protected String name;
	protected String address;
	protected double rate;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public double getRate() {
		return rate;
	}
	public abstract void setAddress(String address);
}
class PhysicalNewspaperSubscription extends NewspaperSubscription{

	@Override
	public void setAddress(String address) {
		if(address.matches(".*\\d+.*")) {
			this.rate = 15;
			this.address = address;		
		}else {
			this.rate = 0;
			System.out.println("Address doesn't contain any digit");
		}	
	}
}
class OnlineNewspaperSubscription extends NewspaperSubscription{

	@Override
	public void setAddress(String address) {
		if(address.contains("@")) {
			this.rate = 9;
			this.address = address;
		}else {
			this.rate = 0;
			System.out.println("Address doesn't contain @");
		}
		
	}
	
}
public class DemoSubscriptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
