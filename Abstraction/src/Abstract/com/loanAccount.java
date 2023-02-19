package Abstract.com;

public class loanAccount implements Account {
	String custname;
	double accbal;
	int accnum;
	private static int randnum=1234567;
	
		public loanAccount(String custname, double accbal, int accnum) {
		this.custname = custname;
		this.accbal = accbal;
		this.accnum = accnum;
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Depositing amount: "+ amount);
		accbal=accbal- amount;
		
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing amount: "+ amount);
		if(accbal>amount) {
			accbal=accbal+amount;
			System.out.println(amount+"Amount succesfully withdrawn");
		}
		else {
			System.out.println("Failed!! Due to insuffisiant amount");
		}
	}

	@Override
	public void viewBalance() {
		System.out.println("Balance Amount is: "+ accbal);
		
	}
	
}
