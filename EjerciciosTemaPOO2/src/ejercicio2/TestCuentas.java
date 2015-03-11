/**
 * @author Diego Jesús Torres Peinado
 * @version 1.1
 * 
 * Comprobacion del funcionamiento de las clases Banco y CuentaBancaria
 */

package ejercicio2;

public class TestCuentas {

	public static void main(String[] args) {

		//Creamos una objeto tipo Banco para guardar las cuentas creadas
		Banco b1 = new Banco();
		
		//Añadimos las cuentas creadas
		b1.addCuenta(new CuentaBancaria());
		b1.addCuenta(new CuentaBancaria(159.2, 1.2));
		b1.addCuenta(new CuentaBancaria(23.4,3.4));
		b1.addCuenta(new CuentaBancaria());
		b1.addCuenta(new CuentaBancaria());
		
		System.out.println(b1);
		
		//Comprobamos el funcionamiento de las clases
		//Obtenemos el saldo mayor de todas las cuentas
		System.out.println("saldo mayor: "+b1.cuentasMayorSaldo());
		
		//Obtenemos el saldo menor de todas las cuentas
		System.out.println("saldo menor: "+b1.cuentasMenorSaldo());
		
		//Obtenemos el saldo medio y el numero de cuentas creadas
		b1.getSaldoMedioYNumeroCuentas();
		
		//Añadimos dinero a una cuenta
		b1.getCuentaCorriente().get(1).depositarDinero(0.8);
		System.out.println(b1.getCuentaCorriente().get(1));
		
		//Eliminamos el numero de cuenta cc5
		//b1.deleteCuenta(cc5);		
		System.out.println(b1);
		
		

		
	}

}
