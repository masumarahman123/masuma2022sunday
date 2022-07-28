package com.Work;

public class Mmasuma1 {

	String s="masuma";
	
	public void task() {		
	System.out.println("method no arguments");
			}
	
	public static int task4(int x) {
		System.out.println("task4   :   "+x);
		return x;
	}
	
	public static String task5(String s) {
		System.out.println("task5 :   "+s);
		return s;
	}
	public static void task5() {
		System.out.println("task5...... :   ");
		
	}
	public  String truefalse(String s) {
		String s1="marry";
		String s2="marrien";
		s1=s2;
		System.out.println("T or F :  "+s1.equals(s2));
		return s2;
			
	}
	public static void main(String[] args) {
		
		System.out.println(Mmasuma1.task5("Masuma"));
		Mmasuma1 Mmasuma=new Mmasuma1();
		Mmasuma.task5();
		Mmasuma.task();
		Mmasuma.task4(200);
		Mmasuma1.task5("Prince");
		Mmasuma.truefalse(null);
		System.out.println(Mmasuma1.task5("dhaka"));
		String s3="asdfg";
		String s4="ASDfG";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s1 ="lolypop";
		String s2="waterlily";
		if(s1.equals(s2)) {
			System.out.println("The condition is true");
		}
		else {System.out.println("The conditon is false");}
	

	}
}
