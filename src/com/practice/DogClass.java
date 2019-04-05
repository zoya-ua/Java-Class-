package com.practice;

	  class DogClass{
		  String name,bread, color; 
	    public static  void main(String []args){
	      DogClass dog1=new DogClass();
	      dog1.name="Lily";
	      dog1.bread="Husky";
	      dog1.color="White";
	      dog1.bark();
	      dog1.run();
	      dog1.play();
	       DogClass dog2=new DogClass();
	      dog2.name="Cake";
	      dog2.bread="Bulldog";
	      dog2.color="Fawn";
	      dog2.bark();
	      dog2.run();
	      dog2.play();
	       DogClass dog3=new DogClass();
	      dog3.name="Lucky";
	      dog3.bread="Labrador";
	      dog3.color="Chocolate";
	      dog3.bark();
	      dog3.run();
	      dog3.play();
	    }
	    void bark(){
	 	   System.out.println(bread+" can bark");
	 	 }
	 	 void run(){
	 	   System.out.println(bread+ "can run");
	 	 }
	 	 void play(){
	 	   System.out.println(bread+ " can play");
	  }
	}