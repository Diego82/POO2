package ejercicio4;

public class Problem {

	//No compila porque hay que declarar la variable static
	static String s;
	//o bien quitar el static a la clase
	static class Inner {
		void testMethod() {
			s = "Set from Inner";
		}
	}
}