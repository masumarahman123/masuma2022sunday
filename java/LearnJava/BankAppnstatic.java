package LearnJava;
//for non static the variable is creating or allocating saparete memory space for each object.
 //Every time I am creating an object a new continer is created.
//

public class BankAppnstatic {
	int bal = 500;
	void dep() {
		int depAmount =500;
		bal=bal+depAmount;
		System.out.println(bal);
	}
	void with() {
		int withAmount=300;
		bal=bal-withAmount;
		System.out.println(bal);
	}
	public static void main(String[] args) {
		
		BankAppnstatic obj=new BankAppnstatic();
		
		obj.dep();
		obj.with();
		obj.with();
		
		BankAppnstatic obj1=new BankAppnstatic();
		obj1.with();
		obj1.dep();
		obj1.with();
		obj1.with();
	}

}
