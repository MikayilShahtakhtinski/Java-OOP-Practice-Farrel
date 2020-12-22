package pizza;
class Pizza{
	private String ingredient;
	private double price;
	public Pizza(String ingredient, double price) {
		this.ingredient = ingredient;
		this.price = price;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "Pizza with ingredient: "+this.ingredient+", and price : "+ this.price;
	}
}
class DeliveryPizza extends Pizza{
	private double DeliverFee;
	private String address;

	public DeliveryPizza(String ingredient, double price, String address) {
		super(ingredient, price);
		if(price>15) {
			this.DeliverFee = 3;
		}else {
			this.DeliverFee = 5;
		}
		this.address = address;
		
	}
	
	public String toString() {
		return super.toString() + ", delivery fee: "+this.DeliverFee + ", and adress is: "+ this.address;
	}
	
}
public class pizzaorder {

	public static void main(String[] args) {
		DeliveryPizza deliveryPizza = new DeliveryPizza("Sausage", 25, "Yeni Yasamal");
		System.out.println(deliveryPizza);
	}

}
