package taxreturn;

import java.util.Scanner;

class TaxReturn {
	private String SocialSecurityNumber;
	private String Fname;
	private String Lname;
	private String Address;
	private String City;
	private int ZipCode;
	private double AnnualIncome;
	private String MartialStatus;
	private double TaxLiability;
	public TaxReturn(String socialSecurityNumber, String fname, String lname, String address, String city, int zipCode,
			double annualIncome, String martialStatus) {
		super();
		SocialSecurityNumber = socialSecurityNumber;
		Fname = fname;
		Lname = lname;
		Address = address;
		City = city;
		ZipCode = zipCode;
		AnnualIncome = annualIncome;
		MartialStatus = martialStatus;
		setTaxLiability();
		
	}
	public double getTaxLiability() {
		return TaxLiability;
	}
	public void setTaxLiability() {
		if(AnnualIncome>=0 && AnnualIncome<=20000) {
			if(this.MartialStatus.equals("Married")) {
				this.TaxLiability = AnnualIncome*0.14;
			}else if(this.MartialStatus.equals("Single")) {
				this.TaxLiability = AnnualIncome*0.15;
			}
		}else if(AnnualIncome>=20001 && AnnualIncome<=50000) {
			if(this.MartialStatus.equals("Married")) {
				this.TaxLiability = AnnualIncome*0.2;
			}else if(this.MartialStatus.equals("Single")) {
				this.TaxLiability = AnnualIncome*0.22;
			}
		}else if(AnnualIncome>=50001) {
			if(this.MartialStatus.equals("Married")) {
				this.TaxLiability = AnnualIncome*0.28;
			}else if(this.MartialStatus.equals("Single")) {
				this.TaxLiability = AnnualIncome*0.15;
			}
		}
	}
	public String toString() {
		return this.Fname + " " + this.Lname + ", with Social number: " + this.SocialSecurityNumber +
				" , living in " +this.City + ", with zip code : " + this.ZipCode + " at Address : "
	+ this.Address + ", with annual income: " + this.AnnualIncome +
	" , being " + this.MartialStatus + " has tax liability of : " + this.TaxLiability;
	}
	
	
}
public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTrueorFalse = true;
		String maritalStatus = "", socialSecurity = "", name,lastname, city = "", address;
		int zipcode;
		double annualincome;
		System.out.println("Enter Name:");
		name = sc.nextLine();
		System.out.println("Enter Last Name");
		lastname = sc.nextLine();
		System.out.println("Enter city: ");
		city = sc.nextLine();
		System.out.println("Enter Address");
		address = sc.nextLine();
		while(isTrueorFalse) {
			System.out.println("Enter Social Security number");
			socialSecurity = sc.nextLine();
			if(!socialSecurity.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]")) {
				break;
			}
			System.out.println("Enter zip code");
			zipcode = sc.nextInt();
			if(Integer.toString(zipcode).length()!=5) {
				break;
			}
			System.out.println("Enter Martial Status");
			maritalStatus = sc.next();
			char c = maritalStatus.charAt(0);
			System.out.println(c);
			
			if(c != 'S' && c != 's' && c != 'M' && c != 'm') {
				break;
			}
			
			System.out.println("Enter Annual income");
			annualincome = sc.nextDouble();
			if(annualincome<0) {
				break;
			}
			TaxReturn tax = new TaxReturn(socialSecurity, name, lastname, address, city, zipcode, annualincome, maritalStatus);
			System.out.println(tax.toString());
			isTrueorFalse = false;
		}
		sc.close();
		
		System.out.println();
	}

}
