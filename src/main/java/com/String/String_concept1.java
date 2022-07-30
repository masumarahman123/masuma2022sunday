package com.String;

public class String_concept1 {

	public static void main(String[] args) {
		//2 way create String
		//literal;,using new memory operator
		//string --returns boolean(t/f)
		//string collection of charecter
		//array stars from index zero
		//
		
		String str="We are learning java";
		
		System.out.println(str.length());//return int
		System.out.println(str.charAt(3));//index of char value
		System.out.println(str.charAt(2));
		
		
		System.out.println(str.indexOf("W"));
		System.out.println(str.indexOf("e"));//
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.indexOf("w"));//w-ans. -1 bec w ta str ea nai
		System.out.println(str.indexOf("W"));//W-ans.W 0 bec W ta str ea asea
		System.out.println(str.indexOf("T"));//true na hola  -1 ans hobea
		System.out.println(str.indexOf("t"));
		
		
		////first occurance
		System.out.println(str.indexOf("a"));//3
		System.out.println(str.indexOf("a",str.indexOf("a",str.indexOf("a"))+1));//9
		System.out.println(str.indexOf("a",str.indexOf("a",str.indexOf("a",(str.indexOf("a",str.indexOf("a",str.indexOf("a"))+1))))+1));//17
		System.out.println(str.indexOf("a",str.indexOf("a",str.indexOf("a",(str.indexOf("a",str.indexOf("a",str.indexOf("a",str.indexOf("a")+1))+1))))+1));//19
		
		
		
		
	}

}
