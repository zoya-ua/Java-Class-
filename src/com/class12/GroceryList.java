package com.class12;

public class GroceryList {
	public static void main(String[] args) {
		
	/*	Create a grocery list: fruits{}
                            veggies{}
                             dairy{}
    Retrive all values using 2 different loops
		
	*/	
		String [] [] list= {{"Fruits :","Mango","Apples","Peafs"},
				{"Veggies:", "Cauliflower","Corn","Potato", "Celery"},
				{"Dairy:","Milk","Cheese"}
					
		                                           };
		for (int i=0;i<list.length;i++) {
			for (int y=0;y<list[i].length;y++) {
				System.out.print(list[i][y]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("For each loop ");
		System.out.println();
		
		for (String [] gros:list) {
			for(String  items:gros) {
				System.out.print(items+" ");
			}
			System.out.println();
		}
		
		
	}

}
