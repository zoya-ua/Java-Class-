package com.class17;

public class NestedLoopDemo {
	public static void main(String[] args) {
		NestedLoopDemo demo=new NestedLoopDemo();
		demo.printNumber7();
		demo.printNumber59();
		demo.printNumber();
		demo.printPattern();
		demo.printPattern2();
		demo.printPattern4();
		demo.printPattern5();
	}
	
void printNumber7(){
	for(int i=1;i<=7;i++) {
		for (int y=1;y<=7;y++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
void printNumber59() {
	for (int i=1;i<=5;i++) {
		for (int y=1;y<=9;y++) {
			System.out.print(y);
		}
		System.out.println();
	}
}
void printNumber() {
	for(int i=1;i<2;i++) {
		for(int y=0;y<=3;y++) {
			System.out.println(i+" "+y);
		}
	}
}
void printPattern() {
for(int i = 1; i <=4 ; i++) {

    for(int x = 1; x <= 5; x++) {
        System.out.print("*");
    }
    System.out.println();
}
}
void printPattern2() {
	for (int i=1;i<5;i++) {
		for (int y=0;y<i;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=5;i>0;i--) {
		for(int y=i;y>0;y--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
void printPattern3() {
	for(int i=1;i<5;i++) {
		
		for(int y=0;y<6;y++) {
			
		
			if(i==1 || i==4 || y==0 || y==5) {
				
	
			System.out.print("*");
	
		} else {
			
					System.out.print(" ");
	
			}
		}
		System.out.println();		
			
			}
}
void printPattern4() {
	
	for (int i=1;i<=5;i++) {
		for(int y=1;y<=i;y++) {
			System.out.print(y);
	}
	System.out.println();
   }	
}
void printPattern5() {
	for (int i = 1; i <=7; i++) {
        for (int y = 0; y<7; y++) {
           if(i==1||i==7 || y==7-i) {
           	
              System.out.print("*");
           	}
           
           else {
              System.out.print(" ");
        } }
        System.out.println(); 
	
        }
}

}
