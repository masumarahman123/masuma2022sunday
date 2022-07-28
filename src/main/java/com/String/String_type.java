package com.String;

public class String_type {

	public static void main(String[] args) {
		/* 2 way to create string
		1.literal
		2.new memory operator,String by creating object
		3.AlsoString Buffer(thread safe) and String Builder(thread safe)
		 * thread safe=(this is good)you can run as much you want
		 * when you work/share other tester can not work.
		 * ex-skype sharing
		 Drawback of thread safe:
		 slow(1 tester work 9 tester stop)
		--reversre word of thread safe -not secure
		
		*/
		
		String s="I am USA citizen";
		String string=new String("I like Automation");//string pass korsi as constructor 
		
		//String comperison
		
		String s1="masuma";
		String s2="rahman";
		String s3="masumA";

		s1.equals(s2);
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equalsIgnoreCase(s3));//t
		
			}

}
