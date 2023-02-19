package exceptionHandling.ty;

import java.util.Scanner;

public class EHMain {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Password");
		int password=ip.nextInt();
		if(password==123) 
			System.out.println("login Succesful");

		else {
			try {
				throw new InvalidPasswordException("Invalid password");
			}
			catch(Exception e){
//				String message=e.getMessage();
//				System.out.println(message);
				System.out.println(e.getMessage());
			}
		}

	}

}
