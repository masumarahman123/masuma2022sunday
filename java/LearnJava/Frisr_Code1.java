package LearnJava;

public class Frisr_Code1 {
	int x=30;
	int y=40;
		double priceBreab=2.99;
	void add() {//command  or instraction
		
		int c=x+y;
		
		System.out.println(c);
	}
void sub() {
	 x=30;
	y=29;
	int p=x-y;
	System.out.println(p);	
	}
	public static void main(String[] args) {
		
		 Frisr_Code1 obj =new  Frisr_Code1();
		 obj.add();
		 obj.sub();
		 obj.add();
		 obj.add();
		 obj.sub();

		 Frisr_Code1 obj1 =new  Frisr_Code1();
		 obj1.add();
		 obj1.sub();	 
	}

}
