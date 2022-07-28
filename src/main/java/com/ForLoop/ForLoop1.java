package com.ForLoop;

public class ForLoop1 {

	public static void main(String[] args) {
		System.out.println("Print 1 to 10 using for loop :  ");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		System.out.println("Print 1 to 10 using  loop :  ");
		int x=1,n=10;
		for(int j=1;j<=n;j++) {
					System.out.println(j);
				}
		
		//while loop
		int p=1,q=10;
		System.out.println("Print 1 to 10 using while loop :  ");
		while(p<=10) {
			System.out.println(p);
			p++;
		}
		
		
		//do while loop
		
		int s=1,t=10;
		System.out.println("Print s :");
		do{
			System.out.println(s);
			s++;
		}while(s<=10);
		
	}

}
