package MainPackage;

public class Test_case extends Account {
	public static void main(String[] args){

		
		
	Account testing = new Account(1122, 20000, 4.5);
	
	testing.deposit(3000);
	System.out.println("Your is Balance: $" + testing.getbalance());
	System.out.println("Created on: "+ testing.getDateCreated());
	System.out.println("Your Monthly interest is: $"+ testing.getAnnualInterestRate());
	try{
		testing.withdraw(4700);
		System.out.println("Your balance after withdrawing $4700 from your bank account is : "+ testing.getbalance());
	
		System.out.println("Currently withdrawing $50000!!!");
		testing.withdraw(50000);
	}
	catch (InsufficientFundsException e){
		System.out.println("You must deposit $"+ e.getAmount()+ "to be able to withdraw from this account again");
		e.printStackTrace();
		}
	}
	
}
