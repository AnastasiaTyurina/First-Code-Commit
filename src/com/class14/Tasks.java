package com.class14;

public class Tasks {

	public static void main(String[] args) {
		// 1. 
		String str="I don't want to go to work today";
		String noSpaces=str.replace(" ", "");
		System.out.println(noSpaces);
		
		//2.
		String str1="#$%^RTHRA erijt ioerjt etr^&*6&8978(789";
		int characters;
		String noCharacters=str1.replaceAll("[^A-Z a-z 0-9]", "");
		System.out.println(noCharacters);
		characters=str1.length()-noCharacters.length();
		System.out.println(characters);
		
		//3.
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
		String[] array=a.split("\\?");
		int length=array.length;
		System.out.println(length);
	}

}
