package acc.com.p1;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner scn1= new Scanner(System.in);
		AccountCreation ac=new AccountCreation();
		AccountTransaction at=new AccountTransaction();
		
		System.out.println("welcome to globle banking system");
		System.out.println("Account creation"); 
			System.out.println("Enter your name");
			String custname=scn1.next();
			
			System.out.println("Enter opening balance account");
			double accbal=scn1.nextDouble();
			
			Account myacc = ac.CreateAccount(custname, accbal);
			System.out.println("Account number: "+ myacc.getAccnum());
			System.out.println("custemer name: "+ myacc.getCustname());
			System.out.println("Account Balance: "+ myacc.getAccbal()); 
			
			
			//performing transactions on account
//			at.viewBalance(myacc);
			System.out.println("Enter Ammount to Deposite");
			double amount= scn1.nextDouble();
			at.deposit(myacc,amount);
			at.viewBalance(myacc);
			System.out.println("enter ammount to withdraw");
			amount= scn1.nextDouble();
			at.withdraw(myacc, amount);
			at.viewBalance(myacc);
	}

}
