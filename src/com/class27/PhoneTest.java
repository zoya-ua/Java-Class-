package com.class27;

public class PhoneTest {
	public static void main(String[] args) {
		//Phone obj=new Phone()-cant instantiate Phone class becouse its abstract class
		Phone phone1=new iPhone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.unlockPhone();
		Phone phone2=new Samsung();
		phone2.makeCall();
		phone2.sendText();
		phone2.unlockPhone();
		phone2.unlockPhone();
	}

}
