package SalesPerson2;

import java.util.Scanner;

class SalesPerson{
	private int ID;
	private double AnnualSales;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getAnnualSales() {
		return AnnualSales;
	}
	public void setAnnualSales(double annualSales) {
		AnnualSales = annualSales;
	}
	public SalesPerson(int iD, double annualSales) {
		super();
		ID = iD;
		AnnualSales = annualSales;
	}
	
	public String toString() {
		return "ID : " + this.ID + " , Sales : " + this.AnnualSales;
	}
	
	
}
public class Sales {

	public static void main(String[] args) {
		SalesPerson[] array = new SalesPerson[20];
		Scanner sc = new Scanner(System.in);
		String choice;
		int count = 0;
		while(true) {
			System.out.println("1 to add:  2 to delete:  3 to change: \nElse Quit");
			choice = sc.next();
			if(choice.contentEquals("1")) {
				if(count>= array.length) {
					System.out.println("Sorry, DataBase is full!!!");
				}else {
					boolean check = true;
					System.out.println("Enter ID ");
					int ID = sc.nextInt();
					for(int j = 0; j < count;j++) {
						if(array[j].getID() == ID) {
							check = false;
							System.out.println("This ID already exists!!!");
							break;
						}
					}
					if(check) {
						System.out.println("Enter Sales");
						double sales = sc.nextDouble();
						array[count] = new SalesPerson(ID, sales);
						count++;
					}
					
				}
			}
			
			if(choice.equalsIgnoreCase("2")) {
				if(count<=0) {
					System.out.println("Database is empty!!!");
					
				}else {
					boolean check = true;
					System.out.println("Enter ID ");
					int ID = sc.nextInt();
					for(int j = 0; j < count;j++) {
						if(array[j].getID() == ID) {
							for(int i = j ; i < count-1; i ++ ) {
								array[i] = array[i+1];
							}
							check = false;
							count--;
							break;
						}
					}
					if(check) {
						System.out.println("Sorry this ID doesn't exitst:  " + ID);
					}	
				}
				
			}
			if(choice.equalsIgnoreCase("3")) {
				if(count<=0) {
					System.out.println("Database is empty!!!");
					
				}else {
					boolean check = true;
					System.out.println("Enter ID");
					int ID = sc.nextInt();
					for(int i = 0; i < count;i++) {
						if(array[i].getID()==ID) {
							System.out.println("Enter new sales: ");
							double sales = sc.nextDouble();
							array[i].setAnnualSales(sales);
							check = false;
							break;
						}
					}
					if(check) {
						System.out.println("Couldn't find");
						
					}
				}
			}
			for(int z = 0 ; z < count; z++) {
				System.out.println("ID: "+ array[z].getID());
			}
			
		}
	}


}
