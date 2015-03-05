package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	//Atributos o variable de instancia
	private List<CuentaBancaria> cuentaCorriente;

	/**
	 * Constructor
	 * @param cuenta
	 */
	public Banco() {
		this.cuentaCorriente = new ArrayList<CuentaBancaria>();
	}
	//getter y setter
	
	
	/**
	 * Metodo que añade una cuenta al banco
	 * @param c
	 */
	public void addCuenta(CuentaBancaria c){
		this.cuentaCorriente.add(c);
	}
	/**
	 * @return the cuentaCorriente
	 */
	public List<CuentaBancaria> getCuentaCorriente() {
		return this.cuentaCorriente;
	}
	
	/**
	 * Método que comprueba si existe el numero de cuenta en la lista para añadirlo o no
	 * @param objeto tipo CuentaBancaria
	 * @return si se repite o no el numero de cuenta
	 */
	public boolean existeNumeroCuenta(CuentaBancaria c){
		boolean aux = false;
		if (this.cuentaCorriente.contains(c))
			aux = true;
		return aux;
	}

	/**
	 * Metodo que elimina una cuenta del banco
	 * @param c
	 */
	public void deleteCuenta(CuentaBancaria c){
		this.cuentaCorriente.remove(c);
	}
	/**
	 * Metodo que devuelve el mayor saldo de todas las cuentas
	 * @return el mayor saldo de todas las cuentas
	 */
	public double saldoMayor(){
		double mayor = Integer.MIN_VALUE;
		for (int i = 0; i < cuentaCorriente.size(); i++) {
			if(cuentaCorriente.get(i).getSaldo()>mayor){
				mayor = cuentaCorriente.get(i).getSaldo();
			}
		}
		return mayor;
	}
	/**
	 * Metodo que devuelve el mayor saldo de todas las cuentas
	 * @return el mayor saldo de todas las cuentas
	 */
	public double saldoMenor(){
		double menor = Integer.MAX_VALUE;
		for (int i = 0; i < cuentaCorriente.size(); i++) {
			if(cuentaCorriente.get(i).getSaldo()<menor){
				menor = cuentaCorriente.get(i).getSaldo();
			}
		}
		return menor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Banco cuentaCorriente: " + cuentaCorriente.toString();
	}
	
	public void getSaldoMedioYNumeroCuentas(){
		System.out.printf("\nNumero de cuentas: %d\nSaldo medio: %.2f€\n",CuentaBancaria.getNumeroCuentasCreadas(),saldoMedioCuentas());
	}
	/**
	 * Metodo que devuelve el saldo medio de todas las cuentas del banco
	 * @return
	 */
	public double saldoMedioCuentas(){
		double suma = 0;
		int i = 0;
		for (i = 0; i < cuentaCorriente.size(); i++) {
			suma += cuentaCorriente.get(i).getSaldo();
		}
		return suma/i;
	}
}
