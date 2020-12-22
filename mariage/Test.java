package mariage;

import java.time.LocalDate;

class Person {
	private String fname, lname;
	private LocalDate birthDate;
	public Person(String fname, String lname, LocalDate birthDate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.birthDate = birthDate;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
class Couple {
	private Person person1, person2;

	public Couple(Person person1, Person person2) {
		super();
		this.person1 = person1;
		this.person2 = person2;
	}

	public Person getPerson1() {
		return person1;
	}

	public void setPerson1(Person person1) {
		this.person1 = person1;
	}

	public Person getPerson2() {
		return person2;
	}

	public void setPerson2(Person person2) {
		this.person2 = person2;
	}
}
class Wedding {
	private LocalDate date;
	private Couple couple;
	private String location;
	public Wedding(LocalDate date, Couple couple, String location) {
		super();
		this.date = date;
		this.couple = couple;
		this.location = location;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Couple getCouple() {
		return couple;
	}
	public void setCouple(Couple couple) {
		this.couple = couple;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String toString() {
		return "The wedding of couple : "+this.couple.getPerson1().getFname()+ " " + this.couple.getPerson1().getLname()+", born in :  "+this.couple.getPerson1().getBirthDate() +" and "+this.couple.getPerson2().getFname()+" "+this.couple.getPerson2().getLname() +", born in :  "+this.couple.getPerson2().getBirthDate() +" will happen at "+this.location+" at "+this.date;
	}

}
public class Test {
	public static void displayWedding(Wedding w) {
		
	}


	public static void main(String[] args) {
		Person p1 = new Person("Aydin", "Shah", LocalDate.of(1996, 5, 6));
		Person p2 = new Person("Gular", "Shah", LocalDate.of(1995, 12, 25));
		Couple couple = new Couple(p1, p2);
		Wedding wedding = new Wedding(LocalDate.of(2019, 6, 22), couple, "Riveria");
		System.out.println(wedding.toString());
	}

}
