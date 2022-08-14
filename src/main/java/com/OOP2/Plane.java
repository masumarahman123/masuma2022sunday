package com.OOP2;

public abstract class Plane {
	
	
public abstract void start();
	
Plane(){ 
		System.out.println("I am parent class constructor");};

	public void stop() {
		System.out.println("Stop the plane");
	}
	
	public void fuel() {
		
	}
		
	public void refuel() {
		System.out.println("I am refuel of parent");
	}
}
