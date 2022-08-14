package com.Array;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		//VirtualCapacity is 10
		//physicalCpasity
		ArrayList<String>s1=new ArrayList<String>();
		ArrayList<String>s2=new ArrayList<String>();
		System.out.println("Array size before add.....");
		System.out.println(s1.size());
        System.out.println(s2.size());//physical capasity zero
        
        
        s1.add("java");
        System.out.println(s1.size());//physical capasity one
        
        
        s1.add("lava");
        System.out.println(s1.size());//physical capasity two
                       
        
        s1.add("papa");
        System.out.println(s1.size());//physical capasity three
        
        
	}

}
