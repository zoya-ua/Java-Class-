package com.class27;
/*Create a class File that will have the following behaviors: 
 *open, edit, close. Edit and close are implemented method while open is an abstract. 
 *Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
 *  Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
 * 
 */

public abstract class File {
	abstract void open();
	void edit() {
	System.out.println("You can edit the file");	
	}
	void close() {
	System.out.println("You can close the file");	
	}

}
class JavaFile extends File{

	@Override
	void open() {
		System.out.println("Java file file can be open with Eclipse");
		
	}		
}
class WordFile extends File{

	@Override
	void open() {
		System.out.println("World file can be open with Microsoft");
		
	}
}
	class PDFFile extends File{

		@Override
		void open() {
			System.out.println("Pdf file can be open with PDFreader");
			
		}
		
	}
	

