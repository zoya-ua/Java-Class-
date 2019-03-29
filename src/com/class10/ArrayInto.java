package com.class10;

public class ArrayInto {
	public static void main(String[]args) {
		int num=10;
		
		//int[]  array1 or int array2[] --> declare an array
		
		int[] array1 = new int[4];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		System.out.println(array1[0]);
		
		int[] numbers=new int[3];
		numbers[0]=2;
		numbers[1]=5;
		numbers[2]=8;
		//numbers[3]=9; error during compalation
		
		System.out.println(numbers[1]+numbers[2]);
		
		// STRING arrays
		String[] a = new String[3];
		a[0]="Hi";
		a[1]="Hello";
		a[2]="Bye";
				
		System.out.println(a[2]);
			
		
	}

}
