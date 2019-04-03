package com.class15;

public class Phone {
	
	String brand,model;
	double price, screensize;
	public static void main(String[] args) {
		Phone phone1=new Phone();
		phone1.brand="Apple";
		phone1.model="xr";
		phone1.price=799.99;
		phone1.screensize=5.8;
		phone1.call();
		phone1.camera();
		phone1.navigator();
		Phone phone2=new Phone();		
		phone2.brand="Google Pixel";
		phone2.model="3";
		phone2.price=799.00;
		phone2.screensize=5.5;
		phone2.call();
		phone2.camera();
		phone2.navigator();
			
	}
	
	void call() {
		System.out.println("Can make calls "+brand+" "+model);
	}
	
   void  camera() {
	   System.out.println("Can make Great Pictures "+brand+" "+model);
   }
   void navigator() {
	   System.out.println("Can navigate you  "+brand+" "+model);
   }
}
