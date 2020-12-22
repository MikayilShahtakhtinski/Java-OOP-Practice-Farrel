package SalesPersons;

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
		Scanner sc = new Scanner(System.in);
		SalesPerson[] DemoSalesPerson = new SalesPerson[7];
		int ID;
		double annual;
		for(int i = 0 ; i < 7 ; i ++) {
			System.out.println("Enter ID: ");
			ID = sc.nextInt();
			System.out.println("Ender Annual: ");
			annual = sc.nextDouble();
			DemoSalesPerson[i] = new SalesPerson(ID, annual);
		}
		System.out.println("Do you want to sort by ID or sales? (Enter ID or sales");
		String choice = sc.next();
		if(choice.equalsIgnoreCase("ID")) {
			for(int j = 0 ; j < DemoSalesPerson.length; j ++) {
				for(int k = j+1 ; k < DemoSalesPerson.length; k++) {
					if(DemoSalesPerson[j].getID()>DemoSalesPerson[k].getID()) {
						SalesPerson temp = DemoSalesPerson[j];
						DemoSalesPerson[j] = DemoSalesPerson[k];
						DemoSalesPerson[k] = temp;

					}
				}
				
			}
			for(int i = 0 ; i < DemoSalesPerson.length;i++) {
				System.out.println(DemoSalesPerson[i].toString());
			}
		}else if(choice.equalsIgnoreCase("SALES")) {
			for(int i = 0 ; i < DemoSalesPerson.length; i ++ ) {
				for(int j = i +1 ; j <DemoSalesPerson.length; j ++ ) {
					if(DemoSalesPerson[i].getAnnualSales()>DemoSalesPerson[j].getAnnualSales()) {
						SalesPerson temp = DemoSalesPerson[i];
						DemoSalesPerson[i] = DemoSalesPerson[j];
						DemoSalesPerson[j] = temp;
					}
				}
			}
			for(int i = 0 ; i < DemoSalesPerson.length;i++) {
				System.out.println(DemoSalesPerson[i].toString());
			}
		}
		
	

	}

}
