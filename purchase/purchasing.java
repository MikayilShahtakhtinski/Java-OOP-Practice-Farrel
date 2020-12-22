package purchase;

import java.util.Scanner;

class Purchase
{

   //variable declarations
   private int invoiceNumber;
   private double sale;
   private double salesTax;
  
   //Constructor to set invoice number, sale and salestax
   public Purchase(int invoiceNumber,double sale,double salesTax) {
       setInvoice(invoiceNumber);
       setSale(sale);
       setSalesTax(salesTax);
   }

  
   //Set methods
   public void setInvoice(int invoiceNumber) {      
       this.invoiceNumber=invoiceNumber;
   }

   public void setSale(double sale) {
       this.sale=sale;  
   }
   public void setSalesTax(double salesTax) {
       this.salesTax=salesTax;  
   }

   //Get methods
   public int getInvoice() {      
       return invoiceNumber;
   }

   public double getSale() {
       return sale;  
   }
   public double getSalesTax() {
       return salesTax;
      
   }
}
public class purchasing {

	public static void main(String[] args) {
		   Scanner scanner=new Scanner(System.in);
	       int sortOrder;
	       //Create five Purchase type objects
	       Purchase[] purchase=new Purchase[5];

	      
	       //Read five purchase objects
	       for (int i = 0; i < purchase.length; i++)
	       {
	           System.out.println("Purchse Item "+(i+1));
	           System.out.println("Enter invoice number: ");
	           int invoice=Integer.parseInt(scanner.nextLine());

	           System.out.println("Enter sales amount: ");
	           double sales=Double.parseDouble(scanner.nextLine());

	           System.out.println("Enter sales tax: ");
	           double salestax=Double.parseDouble(scanner.nextLine());

	           //Create an instance of Purchase and set to purchase array at index i
	           purchase[i]=new Purchase(invoice, sales, salestax);          
	       }
	       
	       System.out.println("Do you want it sorted by invoice or sale amount? (write invoice or sale)");
	       String check = scanner.next();
	       if(check.equalsIgnoreCase("invoice")) {
	    	   for(int i = 0 ; i < purchase.length; i++) {
	    		   for(int j = i+1 ; j < purchase.length;j++) {
	    			   if(purchase[i].getInvoice()>purchase[j].getInvoice()) {
	    				  Purchase temp = purchase[i];
	    				  purchase[i] = purchase[j];
	    				  purchase[j] = temp;
	    				  
	    			   }
	    		   }
	    	   }
	    	   for(int k = 0 ; k < purchase.length;k++) {
	    		   System.out.println("Invoice " + purchase[k].getInvoice());
	    	   }
	       }
	       if(check.equalsIgnoreCase("sales")) {
	    	   for(int i = 0 ; i < purchase.length; i++) {
	    		   for(int j = i+1 ; j < purchase.length;j++) {
	    			   if(purchase[i].getSale()>purchase[j].getSale()) {
	    				  Purchase temp = purchase[i];
	    				  purchase[i] = purchase[j];
	    				  purchase[j] = temp;
	    				  
	    			   }
	    		   }
	    	   }
	    	   for(int k = 0 ; k < purchase.length;k++) {
	    		   System.out.println("Sale " + purchase[k].getSale());
	    	   }
	       }
		
	}

}
