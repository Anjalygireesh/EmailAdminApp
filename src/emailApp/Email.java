package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordlength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String altEmail;
	private String email;
	private String company = "avgSolutions";

	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Email Created: " + this.firstName + " " +
		// this.lastName);

		// call a method asking for department - return the department
		this.department = setDepartment();
		// System.out.println("Department : " + this.department);

		// call a method return a random password
		this.password = generatePassword(defaultPasswordlength);
		System.out.println("Your Password is:" + this.password);

		// generate email firstName.lastName@department.company.com
		email = firstName + "." + lastName + "@" + department + "." + company;
		// System.out.println("Your email is :" + email);
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("New Worker " + firstName + " "
				+ "Department Codes:\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none \nEnter the code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acc";
		} else {
			return "";
		}

	}

	// Generate random password
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYIZ@#$&*1234567890";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);

	}

	// change password
	public void setpassword(String password) {
		this.password = password;
	}

	public String getpassword() {
		return password;
	}

	// set the mailbox capacity
	public void setmailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public int getmailBoxCapacity() {
		return this.mailboxCapacity;
	}

	// set the alternate email
	public void setalternateEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	public String getalternateEmail() {
		return this.altEmail;
	}

	public String showInfo() {
		return "Display Name : " + firstName + " " + lastName + "\nCompany Email : " + email + " "
				+ "\nMailbox Capacity : " + mailboxCapacity + " mb";
	}
}
