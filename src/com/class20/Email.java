package com.class20;

public class Email {
	 String createEmail(String name,String lastName,String emailType) {
		 String email=name+lastName+"@"+emailType;
		return email.toLowerCase();
	}
	public static void main(String[] args) {
	 
	
Email obj=new Email();
System.out.println(obj.createEmail("Zoya","Pen","@gmail.com"));

}
}