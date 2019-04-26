package com.class27;

public class TestFile {
	public static void main(String[] args) {
		JavaFile obj1=new JavaFile();
		obj1.open();
		obj1.edit();
		obj1.close();
		WordFile obj2=new WordFile();
		obj2.open();
		obj2.edit();
		obj2.close();
		PDFFile obj3=new PDFFile();
		obj3.open();
		obj3.edit();
		obj3.close();
	}

}
