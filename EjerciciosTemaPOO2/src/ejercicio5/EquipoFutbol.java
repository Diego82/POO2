package ejercicio5;

public class EquipoFutbol {
	
	static class Entrenador{
		private String nombre;
		private int experiencia;
		
		/**
		 * Constructor
		 * @param nombre
		 * @param experiencia
		 */
		public Entrenador(String nombre, int experiencia) {
			this.nombre = nombre;
			this.experiencia = experiencia;
		}
		
		//Método
		void entrenar(){
			System.out.println("Clase interna");
		}
	}
	
	private static String x = "EquipoFutbol";

		//Método que tiene una clase interna
		void hacerEquipo(){
			class Jugador{
				private String nombre;
				private Posicion demarcacion;
				
				
				public void MetodoInterno(){
					System.out.println("metodo local : Valor de x es " + x);
					
				}
				public enum Posicion{
					PORTERO,DEFENSA,MEDIOCENTRO,DELANTERO
				}
			}
			Jugador jugador = new Jugador();
			jugador.MetodoInterno();
		}
		//Método Main de comprobación
	public static void main(String args[]){
		EquipoFutbol.Entrenador c = new EquipoFutbol.Entrenador("David Vidal",58);
		c.entrenar();
		EquipoFutbol ft = new EquipoFutbol();
		ft.hacerEquipo();
		System.out.println(c);
	}
}