package showstudent;
class Student {
	private int IDnumber;
	private int NumOfCreditHours;
	private int NumofPoints;
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	private double GPA;
	public Student() {
		this.IDnumber = 0;
		this.GPA = 0;
		this.NumOfCreditHours = 0;
		this.NumofPoints = 0;
	}
	public Student(int iDnumber, int numOfCreditHours, int numofPoints) {
		super();
		IDnumber = iDnumber;
		NumOfCreditHours = numOfCreditHours;
		NumofPoints = numofPoints;
	}
	public int getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}
	public int getNumOfCreditHours() {
		return NumOfCreditHours;
	}
	public void setNumOfCreditHours(int numOfCreditHours) {
		NumOfCreditHours = numOfCreditHours;
	}
	public int getNumofPoints() {
		return NumofPoints;
	}
	public void setNumofPoints(int numofPoints) {
		NumofPoints = numofPoints;
	}
	public void setAveragePoint() {
		this.GPA = this.getNumofPoints()/this.NumOfCreditHours;
	}
	public String toString() {
		return "Student with id :"+this.IDnumber+", with GPA "+this.GPA;
	}
	
}
public class ShowStudent {

	public static void main(String[] args) {
		Student student = new Student(999, 3, 12);
		student.setAveragePoint();
		
		System.out.println(student.toString());

	}

}
