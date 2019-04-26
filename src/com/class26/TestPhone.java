package com.class26;

public class TestPhone {
	public static void main(String[] args) {
		System.out.println("-----Object of Parent class------");
		Phone phone =new Phone();
		phone.hasCamera();
		phone.makeCall();
		System.out.println("----Object of Iphone class-----");
		iPhone iphone =new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		System.out.println("------Object of Nokia class-------");
		Nokia phone3 =new Nokia();
		phone3.hasCamera();
		phone3.makeCall();
		System.out.println("-----Object of Samsung class--------");
		Samsung phone4 =new Samsung();
		phone4.hasCamera();
		phone4.makeCall();
		System.out.println("------Object of iPhone class referring to the Parent class-----");
		Phone phone5 =new iPhone();
		phone5.hasCamera();
		phone5.makeCall();
		System.out.println("----Object of Nokia class referring to the Parent class");
		Phone phone6 =new Nokia();
		phone6.hasCamera();
		phone6.makeCall();
		//phone6.cannotBreack();-The method cannotBreack() is undefined for the type Phone
	   System.out.println();
		
		
		Phone parentPhone;//creating a variable of a ParentType
	    parentPhone =new iPhone();// assigning iPhone object
	    parentPhone.makeCall();
	    parentPhone.hasCamera();
	    
	    parentPhone =new Samsung();//assigning Samsung object
	    parentPhone.makeCall();
	    parentPhone.hasCamera();
	    
	    parentPhone =new Nokia();//
	    parentPhone.makeCall();
	    parentPhone.hasCamera();
	
	
	
	
	}

}
