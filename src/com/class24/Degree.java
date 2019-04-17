package com.class24;

public class Degree {
	void getDegree(){
		System.out.println("I got degree");
	}

}
class Postgraduate extends Degree{
	void getDegree(){
		System.out.println("I am a Postgraduate");
	}


}
class Undergraduate extends Degree{
	void getDegree(){
		System.out.println("I am an Undergraduate");
	}

	
	

}
