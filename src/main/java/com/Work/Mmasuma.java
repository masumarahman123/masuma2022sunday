package com.Work;

public class Mmasuma {

	String s="masuma";
	
	public void task() {		
	System.out.println("method no arguments");
			}
	
	public static int task4(int x) {
		
		return x;
	}
	public static String task5(String s) {
		
		return s;
	}
	public  void task6(String x, int y) {	
		
	}
	
	public void truefalse() {
		
			
	}
	public static void main(String[] args) {
		
		System.out.println(Mmasuma.task5("Masuma"));
		Mmasuma  Mmasuma=new Mmasuma();
		Mmasuma.task();
		

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
