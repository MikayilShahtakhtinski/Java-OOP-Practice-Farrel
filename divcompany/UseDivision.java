package divcompany;
abstract class Division{
	protected String name;
	protected String number;
	public Division(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public abstract void display();
}
class InternationalDivision extends Division {
	private String country;
	private String language;

	public InternationalDivision(String name, String number,String country, String language) {
		super(name, number);
		this.country = country;
		this.language = language;
	}

	@Override
	public void display() {
		System.out.println("Name "+ this.name + ",Number"+ this.number+ ",Country:" + this.country+", Language: "+ this.language);
	}
	
}
class DomesticDivision extends Division{
	private String state;
	public DomesticDivision(String name, String number,String state) {
		super(name, number);
		this.state = state;
	}
	@Override
	public void display() {
		System.out.println("Name "+ this.name + ",Number"+ this.number+ ",State:" + this.state);
		
	}
	
}
public class UseDivision {

	public static void main(String[] args) {
		InternationalDivision division = new InternationalDivision("MikailProd", "+9948201103", "Baku", "Eng");
		division.display();
		DomesticDivision division2 = new DomesticDivision("AydinProd", "1233", "Houston");
		division2.display();
	}

}
