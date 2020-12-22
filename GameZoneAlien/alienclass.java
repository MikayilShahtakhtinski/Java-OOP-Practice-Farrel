package GameZoneAlien;
class Alien{
	protected int NumberOfEyes;
	protected String name;
	protected String color;
	protected boolean hasears;
	protected double height;
	protected double weigth;
	
	public Alien(String name, int numberofeyes, String color, boolean hasears, double height, double weight) {
		this.name = name;
		this.NumberOfEyes = numberofeyes;
		this.color = color;
		this.hasears = hasears;
		this.height = height;
		this.weigth = weight;
		
	}
	
	public String toString() {
		if(hasears) {
			return "Alien[name: "+this.name+"|color: "+this.color+"|height: "+this.height+"|weight: "+this.weigth+"|No ears"+"|number of eyes: "+this.NumberOfEyes;	
		}else {
			return "Alien[name: "+this.name+"|color: "+this.color+"|height: "+this.height+"|weight: "+this.weigth+"|has ears"+"|number of eyes: "+this.NumberOfEyes;	
		}
	}
}
class Martian extends Alien{
	public Martian() {
		super("aydin",4,"Yellow",true,1,10);
	}
}
class Jupiterian extends Alien{
	public Jupiterian() {
		super("gular",2,"blue",false,10,2);
	}
}
public class alienclass {

	public static void main(String[] args) {
		Martian martian = new Martian();
		Jupiterian jupiterian = new Jupiterian();
		System.out.println(martian.toString());
		System.out.println(jupiterian.toString());

	}

}
