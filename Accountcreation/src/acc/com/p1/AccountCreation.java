package acc.com.p1;
//functional class
            //creation class

public class AccountCreation {
	private static int randnum=10001;
	
	Account CreateAccount(String custname,double accbal ) {
			Account acc =new Account(randnum++, custname, accbal);
			return acc;
		
	}
	
}
