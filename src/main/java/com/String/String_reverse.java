package com.String;

public class String_reverse {

	public static void main(String[] args) {
		//1.Buffer
		StringBuffer sb=new StringBuffer(" I missed my parent.Don't you ? ");
		System.out.println(sb.length());
		System.out.println("Reverse ## 1 :"+sb.reverse());
		//2.for loop
		System.out.print("Reverse ### 2 :");
		for(int i=sb.length()-1;i>=0;i--) {
			System.out.print(sb.charAt(i));
		}
		
		//3.builder
		StringBuilder sd=new StringBuilder("Safe the world");
		System.out.println(sd.length());
		System.out.println("Reverse #### 3 :"+sd.reverse().toString());
		
		//4
		
		
		System.out.println(sd.length());
		System.out.println("Reverse ####4  :"+sd.reverse().toString());
		
		
		
		
	}

}
 