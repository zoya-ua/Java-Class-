package com.class11;

public class Cars {
	public static void main(String[] args) {
		
		String [][] car= {{ "American : ","Jeep","Ford","Tesla"},
			{"German :","Audi","BMW","Marcedes"},
			{"Korean : ","Kia","Hyundai"},
			{"Italian : ","Ferrari","Alfa Romeo"}
			                                     };
		
		
	for (int i = 0;i<car.length;i++) {
		for(int y=0; y<car[i].length;y++) {
		System.out.print(car[i][y]+" ");
	}
		System.out.println();
	}
	System.out.println("------For each loop ---------");
	
for (String []singleArray:car) {
	for (String cars:singleArray) {
		System.out.print(cars+" ");	
	}
	System.out.println();
}
	}

}
