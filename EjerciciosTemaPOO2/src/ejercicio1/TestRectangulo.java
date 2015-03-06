package ejercicio1;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(3,4);
		Rectangulo r2 = new Rectangulo(6,3);
		Rectangulo r3 = new Rectangulo();
		System.out.println("Numero de rectangulos creados: "+Rectangulo.getNumeroRectangulosCreados());
		Rectangulo r4 = new Rectangulo();
		System.out.println("Numero de rectangulos creados: "+Rectangulo.GetNumeroRectangulosCreados.getNumeroRectangulosCreados());
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);		
	}
}
