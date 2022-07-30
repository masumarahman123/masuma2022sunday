package com.String;

public class Sting_Cocatenation1 {

	public static void main(String[] args) {
	
		
String w="java ";
String y="learning";
int a=2;
int b=3;

//JVM left to right executation kore
System.out.println(w+y);//java learning
System.out.println(w+y+a);//java learning2
System.out.println(w+y+a+b);//java learning23--4 oparation		
System.out.println(w+y+(a+b));//java learning5--3 operation
System.out.println(a+b+w+y);//5java learning		
System.out.println(a+(b+w)+y);//23java learning		
		
//occurance index
System.out.println("i am 1st occarance    "+w.indexOf("a"));
System.out.println("i am 2nd occarance    "+w.indexOf("a",w.indexOf("a")+1));
		
		
System.out.println("i am 1st occarance    "+y.indexOf("n"));
System.out.println("i am 2nd occarance    "+y.indexOf("n",y.indexOf("n")+1));
	

//concatination operator
	}

}
