package emailApplication;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		// get all inputs
		String firstName = getUserInput(input, "Enter first name: ");
		String lastName = getUserInput(input, "Enter last name: ");
		String dept = getUserInput(input, "Enter a department: ");
		String altEmail = getUserInput(input, "Enter an alternative email: ");
		String company = getUserInput(input, "Enter a company: ");
		int mailboxCap =  getUserInputMailBoxCap(input, "Enter mailbox cap: ");
		
		// add to object
		account userAccount = new account();
		userAccount.setFirstName(firstName);
		userAccount.setLastName(lastName);
		userAccount.setDept(dept);
		userAccount.setCompany(company);
		userAccount.setAltEmailAddr(altEmail);
		userAccount.setMailCap(mailboxCap);
		
		// generate email and password
		userAccount.createEmail();
		userAccount.createPassword(15);
		
		// display what just happened
		userAccount.displayAccountInfo();
		
		input.close();
	}
	
	public static String getUserInput(Scanner input, String text) {
		System.out.println(text);
		String answer = input.next();
		
		return answer;
	}
	
	public static int getUserInputMailBoxCap(Scanner input, String text) {
		System.out.println(text);
		int answer = input.nextInt();
		
		return answer;
	}
}
