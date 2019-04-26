package com.constructorReview;

public class Nintendo64 extends GameConsole{
	public static void main(String[] args) {
		
	
Nintendo64 nintendo=new Nintendo64();
nintendo.controller="red&blue";
nintendo.numberOfControler=4;
nintendo.ifTvNeeded=true;
nintendo.cd=false;
nintendo.powerSource="outlet";
//-------------below are attributes----------------
System.out.println(nintendo.controller+" Controler color");
System.out.println(nintendo.numberOfControler+" number of controler");
System.out.println(nintendo.controller+" if Tv is neededr");
System.out.println(nintendo.controller+" is cd required");
System.out.println(nintendo.controller+" is power source needed");
//--------------below are behaviors---------------
/**System.out.println("Is game portable - " +nintendo.portable());
System.out.println("Able to surf the Web -  "+nintendo.surfWeb());
nintendo.readDisk();
 * 
 **/
nintendo.ableToPlay();
System.out.println("Can play Mario Games"+nintendo.canPlayMarioGames());

}
boolean canPlayMarioGames() {
	return true;
}
}