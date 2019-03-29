package com.class10;

public class ArrayTask {
	public static void main(String[] args) {
		char [] a=new char[6];
		// Task! one way
		a[0]='A';
	    a[1]='B';
	    a[3]='C';
	    a[4]='D';
	    a[5]='E'; 
	    System.out.println(a[1]);
		// second way
		char [] b= {'A','B','C','D','E','F'};
		System.out.println(b[1]);
		int z=2;
		System.out.println(b[z]);
		z+=2;
		System.out.println(b[z]);
		//Task2
		String []group =new String[5];
		
       group[0]="Artemv Lepinskyi";
		group[1]="Yulia Melnikova";
		group[2]="Andrei Pazniak";
		group[3]="Zoia Pekun";
		group[4]="Mehmet Aktas";
		System.out.println(group[3]);
		System.out.println();
		System.out.println("Printing group members:");
		
		for(int i=0;i<5;i++) {
			System.out.println(group[i]);
		}
		System.out.println();
		
		//second way
		String []group1= {"Artem","Yulia","Andrei","Zoia", "Mehmet"};
		System.out.println(group1[3]);
		
		//Task3
		String [] j=new String[5];
		j[0]="is ";
		j[1]="Java ";
		j[2]="Saturday ";
		j[3]="coding ";
		j[4]="Day";
		System.out.println(j[2]+j[0]+j[1]+j[3]+j[4]+"!");
		
		//second way
		
		String[] j1 = {"Saturday"," is"," Java"," coding"," day!"};
		System.out.println(j1[0]+j1[1]+j1[2]+j1[3]+j1[4]);
				
		
	}
}