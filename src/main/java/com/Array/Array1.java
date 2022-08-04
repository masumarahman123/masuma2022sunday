package com.Array;

public class Array1 {
/*Array is index collection of homogenious data elements
 * Array is static/length is fixed
 * starts from 0 index
 * Array can be primitive/ref data type
 * advatage;
 * can store multi variable into single variable
 * disadvantage;
 * size is fixed
 * can not pass negative number(NegativeArraySizedException at run time)
 * Array is not generic
 */
	public static void main(String[] args) {
		
		//one dimentional array
		//array for loop deya print korte hoy
		
		int a[]=new int [5];
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		
		//two dimentional array
	 int rows=2;
		 int columns=3;
		int array[][]=new int[rows][columns];
						for(int i=0;i<rows;i++) 
			for (int j=0;j<columns;j++) 
				array[i][j]=0;
			
	int arr[][]=new int [3][4];
		
	 arr[0][0]=10;
	 arr[0][1]=20;
	 arr[1][0]=30;
	 arr[1][1]=40;
	 arr[2][0]=50;
	 arr[2][1]=60;
	 
	 
	
	}

}
