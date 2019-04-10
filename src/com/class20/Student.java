package com.class20;

public class Student {
	
	char getGrade(int grade){
		if (grade>=90) {
			return 'A';
			
		}if (grade>=80 && grade <90) {
			return 'B';
			
		}if (grade>=70 && grade<80) {
			return 'C';
		}if (grade>=50 && grade<70 ) {
			return 'D';
		}else { return 'F';
		}
	}
	public static void main(String[] args) {
		
Student obj=new Student();
System.out.println(obj.getGrade(60));

}
}