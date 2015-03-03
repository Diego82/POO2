package ejercicio1;

import ejercicio2.Banco;
import ejercicio2.CuentaBancaria;

public class TestCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cc1 = new CuentaBancaria();
		CuentaBancaria cc2 = new CuentaBancaria(159.2, 1.2);
		CuentaBancaria cc3 = new CuentaBancaria(23.4,3.4);
		CuentaBancaria cc4 = new CuentaBancaria();
		CuentaBancaria cc5 = new CuentaBancaria();

		//Creamos una objeto tipo Banco para guardar las cuentas creadas
		Banco b1 = new Banco();
		
		//Añadimos las cuentas creadas
		b1.addCuenta(cc1);
		b1.addCuenta(cc2);
		b1.addCuenta(cc3);
		b1.addCuenta(cc4);
		b1.addCuenta(cc5);
		System.out.println(b1);
		
		//Comprobamos el funcionamiento de las clases
		//Obtenemos el saldo mayor de todas las cuentas
		System.out.println("saldo mayor: "+b1.saldoMayor());
		
		//Obtenemos el saldo menor de todas las cuentas
		System.out.println("saldo menor: "+b1.saldoMenor());
		
		//Obtenemos el saldo medio y el numero de cuentas creadas
		b1.getSaldoMedioYNumeroCuentas();
		
		//Añadimos dinero a una cuenta
		b1.getCuentaCorriente().get(1).depositarDinero(0.8);
		System.out.println(b1.getCuentaCorriente().get(1));
		
		
		

		
	}

}
