package com.class22;

public class Students {
	 int grade1,grade2,grade3;
     static String StudentName;
	 Students (String name){
		 
		 StudentName=name;		 
	 }
	 //finding average method
	static  void Average(int grade1, int grade2, int grade3) {
		 int average=(grade1+grade2+grade3)/3;
		 System.out.println("Student: "+StudentName +" average grade is "+average);
	 }
	//Task3
	// private default constructor 
		 private Students(int num,String name) {
			 System.out.println(name+" raiting "+num);
		 }
	public static void main(String[] args) {
		Students  obj1=new Students(5, "Bhaskar" );
		
	}
}
