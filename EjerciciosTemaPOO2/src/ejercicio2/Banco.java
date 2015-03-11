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
		if (!this.cuentaCorriente.contains(c))
			this.cuentaCorriente.add(c);
	}
	/**
	 * @return the cuentaCorriente
	 */
	public List<CuentaBancaria> getCuentaCorriente() {
		return this.cuentaCorriente;
	}

	/**
	 * Metodo que elimina una cuenta del banco
	 * @param c
	 */
	public void deleteCuenta(CuentaBancaria c){
		if (!this.cuentaCorriente.contains(c))
			this.cuentaCorriente.remove(c);
	}
	
	/**
	 * 
	 * @return devuelve una lista con las cuentas con mayor saldo
	 */
	public List<CuentaBancaria> cuentasMayorSaldo(){
		List<CuentaBancaria> lista = new ArrayList<CuentaBancaria>();
		double saldoMayor = Double.MIN_VALUE;
		for (CuentaBancaria cuentaBancaria : cuentaCorriente) {
			if (cuentaBancaria.getSaldo()>saldoMayor)
				saldoMayor = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : cuentaCorriente) {
			if (cuentaBancaria.getSaldo()==saldoMayor)
				lista.add(cuentaBancaria);
		}
		return lista;
	}
	
	/**
	 * 
	 * @return devuelve una lista con las cuentas con mayor saldo
	 */
	public List<CuentaBancaria> cuentasMenorSaldo(){
		List<CuentaBancaria> lista = new ArrayList<CuentaBancaria>();
		double SaldoMenor = Double.MAX_VALUE;
		for (CuentaBancaria cuentaBancaria : cuentaCorriente) {
			if (cuentaBancaria.getSaldo()<SaldoMenor)
				SaldoMenor = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : cuentaCorriente) {
			if (cuentaBancaria.getSaldo()==SaldoMenor)
				lista.add(cuentaBancaria);
		}
		return lista;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Banco cuentaCorriente:\n" + cuentaCorriente.toString();
	}
	
	public void getSaldoMedioYNumeroCuentas(){
		System.out.printf("\nNumero de cuentas: %d\nSaldo medio: %.2f€\n",CuentaBancaria.getNumeroCuentasCreadas(),saldoMedioCuentas());
	}
	/**
	 * Metodo que devuelve el saldo medio de todas las cuentas del banco
	 * @return
	 */
	private double saldoMedioCuentas(){
		double suma = 0;
		int i = 0;
		for (i = 0; i < cuentaCorriente.size(); i++) {
			suma += cuentaCorriente.get(i).getSaldo();
		}
		return suma/i;
	}
}
