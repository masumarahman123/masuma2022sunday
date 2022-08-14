package com.OOP2;

public class Test {
//Gen=grantparent+parent..same
	//child will get whose gen
	//compiletime error..>dimond issue..>ambiguse issue
	//
	public static void main(String[] args) {
		//0 to 100% abstraction
		//how can you achive 0% abstraction
		//expose and non-expose
		/**abstract;
		 * costructor--call korla patrent class constrator asbe first then parent class constructor
		 */
		/**abstract
		 * override method call korle child class er override method asbe
		 * 
		 */
	Qatar qa =new Qatar();//static polymorphism
	
	qa.engine();
	qa.start();
	qa.fuel();
	qa.stop();
	qa.refuel();
	
	Plane pa=new Qatar();//dynamic polymorphism
	pa.fuel();
	pa.stop();
	pa.start();
	pa.refuel();	
		
		
		
	}

}
