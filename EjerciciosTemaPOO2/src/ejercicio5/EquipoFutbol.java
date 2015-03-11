package ejercicio5;

public class EquipoFutbol {
	class Entrenador {
		void entrenar(){
			System.out.println("Clase interna");
		}
	}
	private String x = "EquipoFutbol";
	void hacerEquipo(){
		class Jugador{
			public void MetodoInterno(){
				System.out.println("metodo local : Valor de x es " + x);
			}
		}
		Jugador jugador = new Jugador();
		jugador.MetodoInterno();
	}
	public static void main(String args[]){
		EquipoFutbol.Entrenador c = EquipoFutbol.Entrenador.entrenar();
		c.entrenar();
		EquipoFutbol ft = new EquipoFutbol();
		ft.hacerEquipo();
	}
}