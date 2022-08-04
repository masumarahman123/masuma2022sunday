package com.Array;

import java.util.ArrayList;
import java.util.Iterator;


public class GenericArray {

	public static <E> void main(String[] args) {
	
		
		ArrayList<Integer>al1=new ArrayList<Integer>();		
		ArrayList<String>al2=new ArrayList<String>();		
		ArrayList<Boolean>al3=new ArrayList<Boolean>();	
		ArrayList<E>al4=new ArrayList<E>();//if u dont know what kind of data			
			
		
		//***************************************
			//class er kono object jodi rakhte chai	
		ArrayList<Object>al5=new ArrayList<Object>();	
			Student stone =new Student("suma",3,"maths");
			Student sttwo =new Student("mama",33,"maths");
			Student stthree=new Student("masuma",333,"maths");
			 
			
			al5.add(stone);
			al5.add(sttwo);
			al5.add(stthree);
			//Print class object
			//**using iterator***
			
			Iterator<Object> its=al5.iterator();
			
			while(its.hasNext()) {
				Student	st =(Student)its.next();
				System.out.println(st.name);
				System.out.println(st.age);
				System.out.println(st.dep);
				
			}
			
			//******************************************
			//if u dont know what kind of data	
			//ArrayList<E>al4=new ArrayList<E>();//if u dont know what kind of data			
				
			
			
	}

}
