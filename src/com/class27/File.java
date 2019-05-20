package com.class27;

public abstract class File {
	//Create a class File that will have the following behaviors: open, edit, close. 
	//Edit and close are implemented method while open is an abstract. 
	//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behavior: 
	//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed
	
	public abstract void open();
	public void edit() {
		System.out.println("edit method");
	}
	public void close() {
		System.out.println("close method");
	}
}
 class JavaFile extends File {

	@Override
	public void open() {
		
		System.out.println("To open .java file we need notepad++ or sublime text");
	}
	
}
 class WordFile extends File {

	@Override
	public void open() {
		
		System.out.println("To open .doc file we need Microsoft word to be installed");
	}
	
}
 class PDFFile extends File{

	@Override
	public void open() {
		
		System.out.println("To open a PDF file we need Adobe Acrobat Reader");
	}
	
}