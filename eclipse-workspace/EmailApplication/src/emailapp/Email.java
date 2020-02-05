package emailapp;

import java.util.Scanner;

public class Email {
	//create class variables and make them accessible here only
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 12;
	private String department;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "mycompany.com";
	
	//create constructor to receive firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("The first new email created: " + this.firstName + " " + this.lastName);
		
		//call method asking department -- return department
		this.department = setDepartment();
		System.out.println("Department is: " + this.department);
		
		//call method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Create email syntax
		//combine the elements to generate email id
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
//		System.out.println("Your email is : " + email);
	}
	//we need to ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODE\n1 for Slaes\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) {
			return "Sales";
		} else if(departmentChoice == 2) {
			return "Development";
		} else if(departmentChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}
	//we need to generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!%@#$";
		char[] password = new char[length];
		//create a for loop to look for the [] and generate number
		for(int i=0; i<length; i++) {
			int randomPw = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomPw);		
		}
		return new String(password);
	}
	
	//we need to set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//we need to set the alternate email\
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//implement get method
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	//implement showInfo() method to print name, mailboxcapacity and company email info
	public String showInfo() {
		return "NAME: " + firstName + " " + lastName + 
				"\n COMPANY EMAIL: " + email + 
				"\n MAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
