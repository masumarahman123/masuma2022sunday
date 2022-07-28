package com.String;

public class String_Trim_and_Split {

	public static void main(String[] args) {
		
		//trim();--remove beganning and ending space
		String a=" ";
		
				String p="  https://www.google.com/  ";
				System.out.println(p.length());
				System.out.println("before   :"+p);
				
				String q=p.trim();
				
				System.out.println("after    :"+q);
				System.out.println(p.trim().length());
				
				
				//split--remove middle white space
				
				String t="java learning class";
				
				String t1[] = t.split(" ");//split white space /array  declare korte hobe
				String t2[] = t.split("l");//split l
				
				for(int i=0;i<t1.length;i++) {
					
					System.out.println(t1[i]);
				}
				System.out.println("print string without l   :");
		for(int i=0;i<t2.length;i++) {
					
					System.out.println(t2[i]);
				}

	}

}
