package com.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		/*it is dynamicarray
		 * can contain dupicate
		 * Syschrinized/thread safe
		 * preserved insertion order
		 * best for data retrieval
		 * worst choice to data insertion or deletion
		 * impements the random access interface
		 * faster when you add last
		 */
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(1);
		al.add(2.5);
		al.add("masuma");
		al.add(null);
		al.add(true);
		System.out.println(al);//1.
		
		//print arraylist:
		/*
		 * 4 way :
		 * 1.object deyae
		 * 2.for loop
		 * 3. Iterator--using while loop
		 * 4.advance for loop
		 */
		
		//2.for loop:
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));				
		}
		
	//3.Iterator
		System.out.println("<<<<<<<<<");
		
		Iterator its=al.iterator();
		
		while(its.hasNext()) {
			
			System.out.println(its.next());
		}
		
		
		//4.advance for loop 
		

	    // for each loop 
	    
		
	}

}
