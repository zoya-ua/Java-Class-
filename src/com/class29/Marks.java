package com.class29;

public abstract class Marks {
	abstract int getPercentage();
	

}
class A extends Marks{
	int  m1,m2,m3;
A(int m1,int m2,int m3 ){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	
}
	@Override
	int getPercentage() {
	int Perc=m1+m2+m3/3;	
		return Perc;
			
	}
	
}
class B extends Marks{
	int m1,m2,m3,m4;
	B(int m1,int m2,int m3,int m4){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		
	}
	@Override
	int getPercentage() {
		int Perc=m1+m2+m3+m4/4;	
		return Perc;	
		
	}
	
}
