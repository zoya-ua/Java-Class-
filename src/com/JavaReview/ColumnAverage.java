package com.JavaReview;

public class ColumnAverage {
	public static void main(String[] args) {
		
		//Print the average of values in column 3
	int[][] ar = { { 2, 6, 9, 3, 7 }, 
	               { 1, 7, 9, 4, 8 }, 
	               { 0, 4, 6, 2, 5 },  
	               { 0, 1, 2, 3 } };
  int sum1=0;
  int sum2=0;
  int sum3=0;
  int sum4=0;
  int sum5=0;

for (int i=0;i<ar.length;i++) {
	
			sum1=sum1+ar[i][0];
			sum2=sum2+ar[i][1];
			sum3=sum3+ar[i][2];
			sum4=sum4+ar[i][3];
			sum5=sum5+ar[i][4];			
}
int av1=sum1/ar.length;
int av2=sum2/ar.length;
int av3=sum3/ar.length;
int av4=sum4/ar.length;
int av5=sum5/ar.length;

System.out.println("The average of values in column 1 is "+av1);
System.out.println("The average of values in column 2 is "+av2);
System.out.println("The average of values in column 3 is "+av3);
System.out.println("The average of values in column 4 is "+av4);
System.out.println("The average of values in column 5 is "+av5);


	}

}
