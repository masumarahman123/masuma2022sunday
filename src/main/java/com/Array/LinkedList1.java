package com.Array;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static <E> void main(String[] args) {
		/*Linkedlist used doubly linked list(node) to store element
		 * worst choice to data retrival
		 * best choice to data insertion and deletion
		 * not implements random access interface
		 * faster when add beginning of the list
		 */
		
		LinkedList<Boolean> ll3= new LinkedList<Boolean>();
		LinkedList<E> ll2= new LinkedList<E>();
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("A");
		ll.add("b");
		ll.add("A");
		ll.add("b");
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		
		
		System.out.println("for loop.......");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("using iterator.....");
		Iterator it=ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("*********************");
		
		LinkedList<Object> ll5= new LinkedList<Object>();	
		
		Student stone =new Student("suma",3,"maths");
		Student sttwo =new Student("mama",33,"maths");
		Student stthree=new Student("masuma",333,"maths");
		Student sttfour=new Student("masuma",333,"maths");
		
		ll5.add(stone);
		ll5.add(sttwo);
		ll5.add(stthree);
		ll5.add(sttfour);
		//Print class object
		//**using iterator***
		
		Iterator<Object> its=ll5.iterator();
		
		while(its.hasNext()) {
			Student	st =(Student)its.next();
			System.out.println(st.name);
			System.out.println(st.age);
			System.out.println(st.dep);
		
		
		
		
		
		}	
		
	}

}
