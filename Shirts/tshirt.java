package Shirts;
class TeeShirt{
	private int OrderNumber;
	private String size;
	private String color;
	protected double price;
	public int getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		if(size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")) {
			this.price = 22.99d;
		}else {
			this.price = 19.99d;
		}
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	
}
class CustomTee extends TeeShirt{
	private String slogan;

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
}
public class tshirt {

	public static void main(String[] args) {
		CustomTee customTee = new CustomTee();
		customTee.setSlogan("UFAZ");
		customTee.setColor("Blue");
		customTee.setOrderNumber(123);
		customTee.setSize("XXXL");
		System.out.println(customTee.getPrice());
		customTee.setSize("M");
		System.out.println(customTee.getPrice());

		

	}

}
