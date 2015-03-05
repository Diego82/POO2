package ejercicio2;

import java.time.LocalDate;

public class CuentaBancaria {
	//Atributos
	private String numeroCuenta;
	private double saldo;
	private double interes;
	private LocalDate fechaCreacion;
	private static int cuentasCreadas;
	
	//Constructores
	/**
	 * Constructor por defecto
	 */
	public CuentaBancaria() {
		new CrearNumeroCuenta();
		this.saldo = 0;
		this.interes = 2.5;
		this.fechaCreacion = LocalDate.now();
		cuentasCreadas++;
	}
	/**
	 * @param saldo
	 * @param interes
	 * Constructor introduciendo los datos saldo e interes
	 */
	public CuentaBancaria(double saldo, double interes) {
		new CrearNumeroCuenta();
		this.saldo = saldo;
		this.interes = interes;
		this.fechaCreacion = LocalDate.now();
		cuentasCreadas++;
	}
	
	//getter y setter
	
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}
	/**
	 * @return the fecha de creacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public static int getNumeroCuentasCreadas(){
		return cuentasCreadas;
	}
	/**
	 * 
	 * @param ingreso
	 * @return saldo despues del ingreso
	 */
	public void depositarDinero(double ingreso){
		setSaldo(this.saldo+ingreso);
	}
	/**
	 * 
	 * @param retirada
	 * @return saldo despues de la retirada de dinero
	 */
	public void retirarDinero(double retirada){
		setInteres(this.saldo-retirada);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Numero de Cuenta: "+numeroCuenta+", saldo: "+saldo+"\n";
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}



	//Creacion numero de cuenta mediante una clase interna
	public class CrearNumeroCuenta{
		String ENTIDAD="1234";
		String OFICINA = "5678";
		String digitoControl;
		String numeroCuentaAleatorio;
		
		//Constructor
		public CrearNumeroCuenta(){
			numeroCuentaAleatorio = numeroCuentaAleatorio();
			numeroCuenta = ENTIDAD+"-"+OFICINA+"-"+primerDigitoControl()+segundoDigitoControl()+"-"+numeroCuentaAleatorio();
		}
		
		public String numeroCuentaAleatorio(){
			String numero="";
			for (int i = 0; i < 10 ; i++) {
				numero+= (int)(Math.random()*10);
			}
			return numero;
		}
		
		public int primerDigitoControl(){
			int digito = 0;
			int[] array = {4,8,5,10,9,7,3,6};
			for (int i = 0; i < ENTIDAD.length(); i++) {
				digito += Integer.parseInt(ENTIDAD.substring(i,i+1))*array[i];
			}
			
			if (((11-digito%11) == 11) || ((11-digito%11) == 10)) {
				digito = 1;
			}
			else
				digito = 11 - digito%11;
			
			return digito;
		}
		
		public int segundoDigitoControl(){
			int digito = 0;
			int[] array = {1,2,4,8,5,10,9,7,3,6};
			for (int i = 0; i < array.length; i++) {
				digito += Integer.parseInt(numeroCuentaAleatorio.substring(i,i+1))*array[i];
			}
			
			if (((11-digito%11) == 11) || ((11-digito%11) == 10)) {
				digito = 1;
			}
			else
				digito = 11 - digito%11;
			
			return digito;
		}
	}
}
