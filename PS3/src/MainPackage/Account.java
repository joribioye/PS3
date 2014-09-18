package MainPackage;
import java.util.Date;

public class Account {
	private int ID;
	private double balance;
	private double annualInterestRate = 0;
	private java.util.Date DateCreated;
	
	public Account(){
	      this.ID = ID;		 
	}
	   public Account(int ID, double balance, double annualInterestRate){
		   this.ID= ID;
		   this.balance= balance;
		   this.annualInterestRate = annualInterestRate;
		   this.DateCreated = DateCreated;
		   
	   }
	   
	   public int getID() {
		   return ID;
	   }
	   
	   public void setID(int iD) {
		   ID = iD;
	   }
	   
	   public double getAnnualInterestRate() {
		   return annualInterestRate;
	   }
	   
	   public void setAnnualInterestRate(double annualInterestRate) {
		   annualInterestRate = annualInterestRate;
	   }
	   
	   public double getbalance(){
		   return balance;
	   }
	   
	   public void setBalance(double balance) {
		   this.balance = balance;
	   }
	   
	   public double getMonthlyInterest(){
		   return(annualInterestRate/ 12);
	   }
	   
	   public Date getDateCreated(){
		   return DateCreated;
	   }
	   
	   public void deposit(double amount){
	      balance += amount;
	   }
	   
	   public void withdraw(double amount) throws
	                  InsufficientFundsException
	   {
		   
	      if(amount <= balance){
	         balance -= amount;
	      }
	      else{
	    	  
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	      
	   }
}


