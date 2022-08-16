package LearnJava;
//For static The variable balance will share by all the object.
//no new container is declared.They are using the same one.

public class BabkAppStatic {
	 static int bal = 500;
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
		
		 BabkAppStatic obj=new  BabkAppStatic();
		
		obj.dep();
		obj.with();
		obj.with();
		
		 BabkAppStatic obj1=new  BabkAppStatic();
		obj1.with();
		obj1.dep();
		obj1.with();
		obj1.with();
	
	}
}
