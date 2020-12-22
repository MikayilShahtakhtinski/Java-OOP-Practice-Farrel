package blankets;
class Blanket{
	private String size;
	private String color;
	private String material;
	protected double price;
	public Blanket() {
		this.size = "Twin";
		this.color = "White";
		this.material = "Cotton";
		this.price = 30;
	}
	public void setSize(String size) {
		this.size = size;
		if(size.equals("Double")) {
			this.price+=10;
		}else if(size.equals("Queen")) {
			this.price+=25;
		}else if(size.equals("King")) {
			this.price+=40;
		}else {
			this.price = 30;
		}
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaterial(String material) {
		this.material = material;
		if(material.equals("Wool")) {
			this.price+=20;
		}else if(material.equals("Cashmere")) {
			this.price+=45;
		}else {
			this.price = 30;
		}
	}
	public String toString() {
		return "Blanket size: "+ this.size + ", color: "+ this.color + ", material: "+ this.material + ", price: " +this.price;  
				
	}
	
}
class ElectricBlanket extends Blanket{
	private int NumOfHeatSettings;
	private boolean autooff;
	public ElectricBlanket() {
		super();
		this.setNumOfHeatSettings(1);
		this.setAutooff(false);
	}
	public boolean isAutooff() {
		return autooff;
	}
	public void setAutooff(boolean autooff) {
		this.autooff = autooff;
		if(autooff) {
			this.price+=5.75d;
		}
	}
	public int getNumOfHeatSettings() {
		return NumOfHeatSettings;
	}
	public void setNumOfHeatSettings(int numOfHeatSettings) {
		if(numOfHeatSettings >=1 && numOfHeatSettings <=5) {
			this.NumOfHeatSettings = numOfHeatSettings;
		}else {
			numOfHeatSettings = 1;
		}
	}
	public String toString() {
		return super.toString() + ", Number of Settings: "+ this.NumOfHeatSettings + ", isAuto: " + this.autooff;
	}
}
public class DemoBlankets {

	public static void main(String[] args) {
		Blanket blanket = new Blanket();
		blanket.setSize("King");
		System.out.println(blanket);
		ElectricBlanket electricBlanket = new ElectricBlanket();
		electricBlanket.setAutooff(true);
		System.out.println(electricBlanket);

	}

}
