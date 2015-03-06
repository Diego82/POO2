package ejercicio3;

import ejercicio3.Ventilador.Potencia;

public class TestVentilador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventilador v1 = new Ventilador();
		System.out.println(v1);
		v1.setVelocidad(Potencia.MEDIO);
		System.out.println(v1);
		v1.setColor("Azul");
		v1.setFunciona(true);
		v1.setRadio(100);
		System.out.println(v1);
	}

}
