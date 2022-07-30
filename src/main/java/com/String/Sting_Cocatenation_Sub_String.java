package com.String;

public class Sting_Cocatenation_Sub_String {

	public static void main(String[] args) {
		String w="java ";
		String y="learning java";
				//occurance index
		System.out.println("i am 1st occarance    "+w.indexOf("a"));
		System.out.println("i am 2nd occarance    "+w.indexOf("a",w.indexOf("a")+1));
				
				
		System.out.println("i am 1st occarance    "+y.indexOf("n"));
		System.out.println("i am 2nd occarance    "+y.indexOf("n",y.indexOf("n")+1));
			

		//concatination operator
		
		String first_name="Masuma  ";
		String last_name="Rahman";
		System.out.println(first_name+last_name);

	
	
	//sub_string//+111-000-9876
		
		String ll="learning java is important";
		
	ll.substring(1, 8);
	System.out.println(ll.length());
	System.out.println(ll.substring(1, 8));
	System.out.println(ll.substring(4, 20));
	
	}

}
