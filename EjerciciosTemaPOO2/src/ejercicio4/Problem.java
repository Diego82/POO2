package ejercicio4;

public class Problem {

	//No compila porque hay que declarar la variable static
	String s;
	//o bien quitar el static a la clase
	class Inner {
		void testMethod() {
			s = "Set from Inner";
		}
	}
	public static void main(String[] args) {
		Problem p = new Problem();
		Problem.Inner i = p.new Inner();
		//i.testMethod();
		System.out.println(p.s);
	}
}