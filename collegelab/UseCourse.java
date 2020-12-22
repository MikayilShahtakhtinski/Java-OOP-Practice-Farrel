package collegelab;

import java.util.Scanner;

class CollegeCourse{
	private String department;
	private int CourseNumber;
	private int Credits;
	protected int fee;
	public CollegeCourse(String department, int courseNumber, int credits) {
		this.department = department;
		CourseNumber = courseNumber;
		Credits = credits;
		this.fee = 120*this.Credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getCourseNumber() {
		return CourseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		CourseNumber = courseNumber;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		Credits = credits;
	}
	public int getFee() {
		return fee;
	}
	public String toString() {
		return "Course with course number:"+this.CourseNumber+" at department: "+ this.department + "and number of credits are: "+ this.Credits + " , and fee to pay is :"+ this.fee;
	}
	
}
class LabCourse extends CollegeCourse{

	public LabCourse(String department, int courseNumber, int credits) {
		super(department, courseNumber, credits);
		this.fee+=50;	
	}
	 public String toString() {
		 return "Lab " + super.toString();
	 }
	
}
public class UseCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String department;
		int coursenumber;
		int credit;
		System.out.println("Enter department: ");
		department =  sc.next();
		System.out.println("Enter course number");
		coursenumber = sc.nextInt();
		System.out.println("Enter number of credits");
		credit = sc.nextInt();
		if(department.equalsIgnoreCase("BIO") || department.equals("CHM") || department.equalsIgnoreCase("CIS") || department.equalsIgnoreCase("PHY")) {
			LabCourse labcoure = new LabCourse(department, coursenumber, credit);
			System.out.println(labcoure.toString());
		}else {
			CollegeCourse collegeCourse = new CollegeCourse(department, coursenumber, credit);
			System.out.println(collegeCourse.toString());
			
		}
		sc.close();

	}

}
