package Collegecourse;

import java.util.Scanner;

class CollegeCourse {
	private String ID;
	private int CreditHours;
	private String Grade;
	
	public CollegeCourse(String iD, int creditHours, String grade) {
		super();
		ID = iD;
		CreditHours = creditHours;
		Grade = grade;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getCreditHours() {
		return CreditHours;
	}
	public void setCreditHours(int creditHours) {
		CreditHours = creditHours;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
}
class Student {
	private int IDNumber;
	private CollegeCourse[] courses = new CollegeCourse[3];
	public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	public CollegeCourse getCourse(int index) {
		return this.courses[index];
	}
	public void setCourse(CollegeCourse course, int index) {
		this.courses[index] = course;
	}
	
	
}
public class college {

	public static void main(String[] args) {
		Student[] students = new Student[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i ++) {
			System.out.println("Enter ID for " + (i+1) + " student");
			int ID = sc.nextInt();
			students[i] = new Student();
			students[i].setIDNumber(ID);
			for(int j = 0 ; j < 3; j ++) {
				System.out.println("Enter name of "+ (j+1) + " course: ");
				String coursename = sc.next();
				System.out.println("Enter CreditHours ");
				int crrdithours = sc.nextInt();
				System.out.println("Enter grade ");
				String grade = sc.next();
				while(grade.charAt(0) != 'A' && grade.charAt(0) != 'B' && grade.charAt(0) != 'C' && grade.charAt(0) != 'D' && grade.charAt(0) != 'E' && grade.charAt(0) != 'F') {
					System.out.println("Wrong grade! Enter again: ");
					grade = sc.next();
				}
				CollegeCourse course = new CollegeCourse(coursename, crrdithours, grade);
				students[i].setCourse(course, j);
			}
			
		}
		
		for(int s = 0; s<2; s++)
	    {
	        System.out.print("\nStudent# " +
	                students[s].getIDNumber());
	        System.out.println();
	        for(int c=0;c<3;++c)
	            System.out.print(students[s].getCourse(c).getID() + " ");   
	        System.out.println();
	    }   
		sc.close();
	}
	
}
