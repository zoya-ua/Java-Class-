package com.practice;
 class SyntaxTechnologies
{
  String schoolName;
  int batch;
  String year;
  String lastDayOfClass;
  
  SyntaxTechnologies (){
    schoolName="Syntax";
    batch=4;
    year="2019";
    lastDayOfClass="August 30";
  }
	public static void main(String[] args)
	{
	  SyntaxTechnologies obj=new SyntaxTechnologies();
	  System.out.println(obj.schoolName);
	
	}
}