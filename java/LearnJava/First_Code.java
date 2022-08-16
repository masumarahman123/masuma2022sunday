package LearnJava;

public class First_Code {//hard code
	int x=10;
	int y=29;
	void add() {//command  or instraction
		
		int c=x+y;
		System.out.println(c);
	}
void sub() {//wrong beacuse without  declaration we can't initilized
	 x=50;
	int y=29;
	int p=x-y;
	System.out.println(p);	
	}
void mul() {
	int x=30;
	int y=29;
	int q=x*y;
	System.out.println(q);
}
void xyz() {
	int x=10;
	int y=29;
	int r=x/y;
	System.out.println(r);//0
}
void qwe() {
	System.out.println("I am danceing");
}
void asd() {
	String x ="Mohammed";
	System.out.println("Name: "+x);
}
	void div() {
		
		double c=(double) x/y;//casting//0.3448
			System.out.println(c);
	}
	void div2() {
		double p=x/y;		
		System.out.println(p);//0.0
		
	}
	void div11() {
		long c=(long)x/y;
		System.out.println(c);//0
	}
	
	void asdf() {
		double a=2.0;
		double b=3.0;
		int x=(int)(a+b);
		System.out.println(a);
	System.out.println(b);
	System.out.println(x);
	
	}
	void quality() {
	if(x+y<76) {
		System.out.println("The product is good");}
		else {System.out.println(x+y);}				
			
		}	
		
	public static void main(String[] args) {
		
		First_Code  obj= new First_Code ();
		obj.add();
		obj.sub();
		obj.mul();
		obj.xyz();
		obj.qwe();
		obj.asd();
		obj.quality();
		
	}

}
