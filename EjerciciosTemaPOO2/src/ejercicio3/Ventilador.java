
package ejercicio3;

/**
 *
 * @author Diego Jesús Torres Peinado
 * @version 1.0
 */
public class Ventilador {
	private Potencia velocidad;
	private boolean funciona;
	private double radio;
	private String color;
	
	//Constructor
	public Ventilador() {
		this.velocidad = Potencia.LENTO;
		this.funciona = false;
		this.radio = 50;
		this.color = "blanco";
	}

	/**
	 * @return the velocidad
	 */
	public Potencia getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(Potencia velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the funciona
	 */
	public boolean isFunciona() {
		return funciona;
	}

	/**
	 * @param funciona the funciona to set
	 */
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	//Tipo Enum para guardar las constantes
	public enum Potencia{
		LENTO, MEDIO, RAPIDO
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ventilador velocidad: " + velocidad + ", funciona: " + funciona
				+ ", radio: " + radio + ", color: " + color;
	}
	
}
