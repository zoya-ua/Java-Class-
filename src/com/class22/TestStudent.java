package com.class22;

public class TestStudent {
	public static void main(String[] args) {
		Students obj1 =new Students("Anna P");
		obj1.Average(90,60,78 );
		Students obj2 =new Students("Carlos K");
	    obj2.Average(87,67,50);
	    Students obj3 =new Students("Mila V");
	    obj2.Average(87,77,92);
	    Students obj4 =new Students("Carlos K");
	    obj2.Average(40,67,78);
	  //  Students  obj5=new Students(5, "Bhaskar" ); -private constructors can be called within same class
		
	}

}
