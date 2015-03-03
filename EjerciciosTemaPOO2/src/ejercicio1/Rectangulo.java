
package ejercicio1;

public class Rectangulo {
	private double alto;
	private double ancho;
	private static int contadorRectangulos;
	//Constructor por defecto
	public Rectangulo() {
		this.alto = 1;
		this.ancho = 1;
		contadorRectangulos++;
	}
	/**
	 * @param alto
	 * @param ancho
	 */
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
		contadorRectangulos++;
	}
	
	public double getArea(){
		return this.alto*this.ancho;
	}
	
	public double getPerimentro(){
		return alto*2+ancho*2;
	}
	
	public static int getNumeroRectangulosCreados(){
		return contadorRectangulos;
	}
	
	public static class GetNumeroRectangulosCreados{
		public static int getNumeroRectangulosCreados2(){
			return contadorRectangulos;
		}
		
	}
	
}
