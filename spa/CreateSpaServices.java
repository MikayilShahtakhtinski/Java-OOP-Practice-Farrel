package spa;
import java.util.Scanner;

class SpaService {
	private String serviceDescription;
	private double price;
	public SpaService() {
		this.serviceDescription = "XXX";
		this.price = 0;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}


public class CreateSpaServices {

	public static void main(String[] args) {
		
		SpaService firstService = new SpaService();
		firstService = getData(firstService);
		System.out.println(firstService.getPrice());
	}
	public static SpaService getData(SpaService service) {
		 String servic;
		 double price;
		 Scanner keyboard = new Scanner(System.in);
		 System.out.print("Enter service >> ");
		 servic = keyboard.nextLine();
		 System.out.print("Enter price >> ");
		 price = keyboard.nextDouble();
		 keyboard.nextLine();
		 service.setPrice(price);
		 service.setServiceDescription(servic);
		 keyboard.close();
		 return service;

		
	}

}
