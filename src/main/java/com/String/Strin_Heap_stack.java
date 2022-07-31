package com.String;

public class Strin_Heap_stack {

	public static void main(String[] args) {
/*scp=String constant pull=no duplicate value
 * s1 variable store stack
 * s1 variable store hoy (masuma) heap ae
 * 
 */
		
		String x="masuma";
		String y="masuma";
		
		
		System.out.println(	x==y);//referance variable er value compare
		System.out.println(x.equals(y));//referance variable compare
		System.out.println("***********");
		
		
		
		String z=new String("masuma");
		System.out.println(x==z);
		System.out.println(x.equals(z));

	}

}
