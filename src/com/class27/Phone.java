package com.class27;

public abstract class Phone {
public void makeCall() {
	System.out.println("Phone can make calls");
}
public void sendText() {
	System.out.println("Phone send text");
}
public abstract void unlockPhone();
public abstract void viewPictures();

}
class iPhone extends Phone{//-concrete class-is class that is inherited from
	//an abstract class or implemented by interface and providing implementation 
	//of all unimplimented/abstract classes
	@Override
	public void unlockPhone() {
		System.out.println("To unlock Iphone we can use FaceId");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Iphone go to Images");
		
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Sumsung we can use FaceId");
		
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Sumsung go to Photos");
		
		
	}
	
}

