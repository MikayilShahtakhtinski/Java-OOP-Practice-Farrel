package personemployeefacultystudent;

import java.util.Scanner;

class Person{
	private String fname;
	private String lname;
	private String address;
	private String zipcode;
	private String number;
	
	public Person() {
		setData();
	}
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fname: ");
		this.fname = sc.nextLine();
		System.out.println("Enter lname: ");
		this.lname = sc.nextLine();
		System.out.println("Enter address: ");
		this.address = sc.nextLine();
		System.out.println("Enter zipcode: ");
		this.zipcode = sc.nextLine();
		System.out.println("Enter phone number: ");
		this.number = sc.nextLine();

	}
	
	public String display() {
		return this.fname + " " + this.lname + " living at " + this.address + " having a zipcode: " +this.zipcode + " and phone number: " + this.number;
	}
	
}
class CollegeEmployee extends Person{
	private String SocSecNum;
	private double salary;
	private String department;
	public CollegeEmployee() {
	 	
	}
	public void setData() {
		super.setData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Social Security number: ");
		this.SocSecNum = sc.nextLine();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter department: ");
		this.department = sc.nextLine();
	}
	public String display() {
		return super.display() + " social number : "+ this.SocSecNum + " salary: " + this.salary + " department: " + this.department;
	}
}
class Faculty extends CollegeEmployee{
	private boolean tenured;
	
	public Faculty() {
		
	}
	
	public void setData() {
		super.setData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Is tennered or not ( Write true or false): ");
		this.tenured = sc.nextBoolean();
	}
	public String display() {
		if(tenured) {
			return super.display() + " tenured";
		}else {
			return super.display() + " not tenured";
		}
	}
}
class Student extends Person{
	private String FieldofStudy;
	private double gradeaverage;
	public void setData() {
		super.setData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter field of study: ");
		this.FieldofStudy = sc.nextLine();
		System.out.println("Enter Grade: ");
		this.gradeaverage = sc.nextDouble();
		sc.nextLine();
	}
	public String display() {
		return super.display() + " field of study:" + this.FieldofStudy + " average grade: " + this.gradeaverage;
	}
	
}
public class CollegeList {

	public static void main(String[] args) {
		Person[] persons = new Person[14];
		String choice;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			if(i>=14) {
				System.out.println("Cant add more!!!");
				break;
			}
			System.out.println("C)ollege Employee.\n" + "F)eculty.\n" + "S)tudent.\n" + "Q)uit.");
			choice = sc.nextLine();
			if(choice.equals("C")) {
				persons[i] = new CollegeEmployee();
				i++;
			}
			if(choice.equals("F")) {
				persons[i] = new Faculty();
				i++;
			}
			if(choice.equals("S")) {
				persons[i] = new Student();
				i++;
			}
			if(choice.equals("Q")) {
				try {
					for(int j = 0 ; j < i ; j++) {
						System.out.println(persons[j].display());
					}
					
				}catch (Exception e) {
					
				}
				
			}
			

			
			
		}while(!choice.equalsIgnoreCase("Q"));
		
	}

}


