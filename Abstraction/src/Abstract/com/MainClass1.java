package Abstract.com;

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println(" Main method started");
		Account a1;
		a1 =new loanAccount("shashi",25000.00, 0);
		a1.viewBalance();
		a1.deposit(5000.00);
		a1.viewBalance();
		a1.withdraw(500.00);
		a1.viewBalance();
		
		System.out.println(" Main method ended");
	}
}
