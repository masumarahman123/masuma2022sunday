package com.Array;

import java.util.ArrayList;

public class ArrayAdding {

	public static void main (String[]args) {
		//Add 2 array
ArrayList<String> as=new ArrayList<String>();
ArrayList<String> ass=new ArrayList<String>();		
		as.add("java");
		ass.add("lear");
		ass.add("earn");
		ass.add("learning");
		//print 1st array(as) and 2nd array(ass)
		System.out.println(as);
		System.out.println(ass);
		//or
		for(int i=0; i<as.size();i++) {
			System.out.println("using for loop before adding---"+as);
		}
		
		//adding
		as.addAll(ass);
		System.out.println(as.addAll(ass));
		//print after adding
		System.out.println(as);
		//or
		for(int i=0;i<as.size();i++) {
					}
		System.out.println("After adding ....."+as);
	}
}
