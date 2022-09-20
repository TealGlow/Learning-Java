package emailApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class account {
	private Map<String, String> deptMap = new HashMap<String, String>();

	
	private String firstName;
	private String lastName;
	private String dept;
	private String emailAddr;
	private String altEmailAddr;
	private String password;
	private String company;
	private int mailboxCap;
	
	public account() {
		this.firstName = "";
		this.lastName = "";
		this.dept = "";
		this.emailAddr = "";
		this.altEmailAddr = "";
		this.password = "";
		this.company = "";
		this.mailboxCap = 0;
		
		deptMap.put("sales", "Sales");
		deptMap.put("accounting", "Accounting");
		deptMap.put("development", "Development");
	}
	
	// setters
	public void setFirstName(String f_name) {
		this.firstName = f_name;
	}
	
	public void setLastName (String l_name) {
		this.lastName = l_name;
	}
	
	public void setDept(String dep) {
		String val = deptMap.get(dep.toLowerCase());
		this.dept = val!=null ? val : "";
	}
	
	public void setEmailAddr(String email) {
		this.emailAddr = email;
	}
	
	public void setAltEmailAddr(String altEmail) {
		this.altEmailAddr = altEmail;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public void setMailCap(int cap) {
		this.mailboxCap = cap;
	}
	
	public void setCompany(String comp) {
		this.company = comp;
	}
	
	// getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public String getEmailAddr() {
		return this.emailAddr;
	}
	
	public String getAltEmailAddr() {
		return this.altEmailAddr;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public int getMailCap() {
		return this.mailboxCap;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void createEmail() {
		this.emailAddr = this.firstName
							+ "." 
							+ this.lastName 
							+ "@" 
							+ (this.dept != "" ? this.dept + "." : "")
							+ this.company 
							+ ".com";
	}
	
	public void createPassword(int len) {
		// generate a random password of length 10
		String arr = "";
		String accepted = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!#_-+$*";
		Random rand = new Random();
		
		for(int i=0; i<len; i++) {
			arr = arr + Character.toString(accepted.charAt(rand.nextInt(122)%(accepted.length())-1));
		}
		
		this.password = arr.toString();
	}
	
	public void displayAccountInfo() {
		System.out.println("First Name: "+ this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Password: " + this.password);
		System.out.println("Email: " + this.emailAddr);
		System.out.println("Alternative Email: " + this.altEmailAddr);
		System.out.println("Company: " + this.company);
		System.out.println("Department: " + this.dept);
		System.out.println("Mailbox Cap: " + this.mailboxCap);
	}
}