package com.Oops;

public class testrunner {

	public static void main(String[] args) {
	
		DBB dbb=new DBB();//static polymorphism/
		//System.out.println(dbb.loan1();//can not print ,complition error
		
		dbb.carloan();
	
		
		
		BB bb=new DBB();//dynamic polymorphism/runtime/Top casting 
		//System.out.println(bb.loan1());//compilition error
		bb.loan();
		System.out.println();
		FDR fdr=new DBB();
		//System.out.println(fdr.loan1());//compilition error
		
		
	System.out.println(	bb.branch);
	System.out.println(	bb.branch);	
	
	
	//down casting
	
	/*DBBL dbbl=new BB();//compile time error
	 
	 
	 
	 ClassCastException
	
	up casting --parent p=new child();
	Trying--down casting --child c =new parent();--compiletime error
	downcasting --parent p=new child();
	
					child c=(child)p;
					alloewd cause p refers child
	*/
	//parent class object can be refferd by child class reference variable
	
	//is that possible  Ans .no. compiletime error show koebe
	//But casting kore kora jabe	
	//like DBBL dbbl=(DBBL)new BB();
	//then we will get castClassEXPETION dakhabe
	//We can perform Upcasting implicitly or explicitly, but downcasting cannot be implicitly possible.
	
	
	
	}

}
