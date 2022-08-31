package com.String;

public class StringConstrainPool {


	public static void main(String[] args) {

	    // Iterate over a string backward
	   
	        String s = "    Reverse String     ";
	 
	        String[] arr = s.split("");
	 
	        for (int i =arr.length-1;i>0;i--) {
	            System.out.print(arr[i]);
	        }

	}}
