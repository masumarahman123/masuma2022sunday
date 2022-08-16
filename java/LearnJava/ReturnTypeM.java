package LearnJava;

public class ReturnTypeM {
 
	void normal() {
		int a = 12+13;
		
	}
	int retuetype1() {
		int a=12+14;
		return a;
	}
	String retuern2() {
		String a="Masuma";
		return a;
	}
	public static void main(String[] args) {
		
		ReturnTypeM obj=new ReturnTypeM();
		
obj.normal();
obj.retuetype1() ;
	System.out.println(obj.retuern2());
	System.out.println(obj.retuetype1());
	//System.out.println(obj.normal());// not return type
	}

}
