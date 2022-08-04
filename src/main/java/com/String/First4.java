package com.String;

public class First4 {

	
		int updateForVariable =100;
		
		 public void first4() {
	  	   System.out.println("I am first4()");
	     }
		 public void first4of2() {
		  	   System.out.println("I am first4of2()");
		     }
			 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int i=1;int n=5;
	String s="java";

	System.out.println(i+n+s);
	while(i<=n) {
		System.out.println(i);
		i++;
	}
	int x=2; int y=7;
	do {
		x++;
		System.out.println(x);
	}while(x<=y);

	String st="We are learing Java";

	System.out.println(st.indexOf("a",st.indexOf("a")+1));


	System.out.println(st.indexOf("a",st.indexOf("a")+2));



	}

}
