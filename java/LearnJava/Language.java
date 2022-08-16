package LearnJava;

public class Language {
	void bang() {
		System.out.println("I am speak in Bangoli ------");
	}
	void eng() {
		System.out.println("I speak in English____");
	}
	void frc() {
		System.out.println("I speak in france---");
	}

	public static void main(String[] args) {
		 Language lang=new  Language();
		 lang.bang();
		 lang.eng();
		 lang.frc();
	}

}
