package acc.com.p1;
//operations related to account

public class AccountTransaction {
	void viewBalance(Account a1) {
		System.out.println("Account balance: "+a1.getAccbal());
		
	}
	void deposit(Account a1,double ammount) {
		a1.setAccbal(a1.getAccbal()+ammount);
	}
	void withdraw(Account a1,double ammount) {
	if(ammount<a1.getAccbal())
	{
		a1.setAccbal(a1.getAccbal()-ammount);
	}
	else
	{
		System.out.println("Failed due to insufficiant balence");
	}
}
}
