package com.class15;

public class Dog {
	String breed,color;
	int age;
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.breed = "Husky";
		dog1.age=5;
		dog1.color="Gray";
		
		dog1.play();
		dog1.bark();
		Dog dog2 =new Dog();
		dog2.breed="Bulldog";
		dog2.age=3;
		dog2.color="White";
		dog2.play();
		dog2.snore();
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.age=7;
		dog3.color="Chocolate";
		dog3.play();
		dog3.swim();
	}
	void play() {
		System.out.println(breed+" Like to play");
	}
    void bark() {
	System.out.println(breed+" Barking loud");
}
    void swim() {
    	System.out.println(breed+" Like to swim");
    }
    void  snore() {
    	System.out.println(breed+" Snores a lot");
    	
    }
}
