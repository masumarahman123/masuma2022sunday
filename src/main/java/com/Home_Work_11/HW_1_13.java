package com.Home_Work_11;

public class HW_1_13 {

public static void pro_1() {
		System.out.println("no argument");
	}
	
	
public static void pro_2() {
		System.out.println("I am void trturns nothing");
		}
	
	
public static boolean  pro_3() {
		String s1="qq";
		String s2="pp";
	 s1=s2;
	return false;
	}
	
	
public static   void pro_4(int a) {
		System.out.println("I am pro4.............."+a);
	}
	
	
public static void pro_5(String st,String st1) {
	
		System.out.println("I am pro5.............."+"st"+"st1");
}


public static void pro_6(String st,int a) {
	
	System.out.println("I am pro6.............."+"st"+a);
}

public static void pro_7(String st,int a,boolean b) {
	
	System.out.println("I am pro7.............."+"st"+a+b);
	
}


public static int pro_8(int b,int a) {

	System.out.println("I am pro8..............");
	return a+b;

}

public static boolean pro9(String s1,String s2) {
	
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("I am pro9......");
		return true;
	}
	else{return false;}
	
}

public static void pro10() {
	System.out.println("I am pro10....");
	int a = 1;
	while(a<=10) {
							
		System.out.println(a);
		a++;
	}
	
}

	public static String problem_11(String s,int a) {
		String newone="";
		for(int i=0;i<a;i++) {
			newone=newone+s;
		}		
		return newone;}
	
	
	public static String pro_12(String str) {
		String front;
		if(str.length()>=0) {
			
			front =str.substring(0, 3);
			System.out.println(front);
		}
		else {front=str;		}
		
		return front+front+front;
	}
	
	
	public static String pro_13(String str) {
		String lastchar=str.substring(str.length()-1);
		String newSt=lastchar+str+lastchar;
			return newSt;
		
	}
	
	
	public static boolean pro14(int x) {
		
		if(x%3==0 || x%10==0 ||x%8==0) {
			return true;
		}
		else {System.out.println("The given no is not multipple of  the given number");}
		
					return false;
			}
	
	
	public static void main(String[] args) {
		
		HW_1_13.pro_1();
		HW_1_13.pro_2();
		System.out.println(HW_1_13.pro_3());
		HW_1_13.pro_4(10);
		HW_1_13.pro_5(null, null);
		HW_1_13.pro_6(null, 0);
		HW_1_13.pro_7(null, 0, false);
		System.out.println(HW_1_13.pro_8(10,20));
		System.out.println(HW_1_13.pro9("JAVA", "java"));
		HW_1_13.pro10();
String	s11=HW_1_13.problem_11("masuma", 10);
		
		System.out.println("pro 11..."+s11); 
		
		System.out.println("Ans of 14 ...."+HW_1_13.pro_12("Bangladesh"));
		
		System.out.println("Ans of 13 ...."+HW_1_13.pro_13("Stream"));
		System.out.println(HW_1_13.pro14(35));
	}

}
