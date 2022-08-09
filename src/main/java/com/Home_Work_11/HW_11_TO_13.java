package com.Home_Work_11;

public class HW_11_TO_13 {

	
	
	public static void main(String[] args) {
		
		
		String s="Masuma";
		 int n=10;
		 
		 // Ques 11:
		//1.  String.repeat() API [Since Java 11]
		 System.out.println("String.repeat() :");
		System.out.println( s.repeat(n));
		
		//2.for loop
		
		System.out.println("for loop:");
		for(int i=0;i<n;i++) {
			
			System.out.print(s);
		}
		System.out.println();
		
		
		// Ques 12:
		System.out.println("After split:");
		String sp=s.replace("uma", "");		
		for(int i=0;i<n;i++) {
			System.out.print(sp);
		}
		
		

		// Ques 13:concatination
		System.out.println();
		String m="Pop";
		
		 String x="p";
		 String y=x.concat(m);
		System.out.println(y+x);
	//or
		System.out.println(x+m+x);
	}

}
