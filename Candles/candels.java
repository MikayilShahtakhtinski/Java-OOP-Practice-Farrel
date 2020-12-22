package Candles;
class Candle{
	private String color;
	private double height;
	protected double price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.price = 2* height;
		this.height = height;
	}
	public double getPrice() {
		return price;
	}
}
class ScentedCandle extends Candle{
	private String scent;

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	public void setHeight(double height) {
		super.setHeight(height);
		this.price = 3 * height;
				
	}
}
public class candels {

	public static void main(String[] args) {
		ScentedCandle candle = new ScentedCandle();
		candle.setColor("Blue");
		candle.setHeight(12);
		candle.setScent("Rose");
		System.out.println("Scented candle with color: "
				+ candle.getColor() + " and price : " + candle.getPrice());
	}

}
