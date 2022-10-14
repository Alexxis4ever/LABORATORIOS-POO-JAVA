public class Principal {
	
	Flecha flecha1,flecha2,flecha3;

	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
	}
	
	public Principal () {
		flecha1=new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();

		flecha2=new Flecha();
		flecha2.longitud=34;
		flecha2.color="rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3=new Flecha(12,"negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
	}
	
	public class Flecha {
		
		int longitud;
		String color;
		
		public Flecha() {
			longitud=18;
			color="negro";
		}
		
		
		public Flecha(int longitud, String color) {
			this.longitud=longitud;
			this.color=color;
		}
		
		public void imprimirEspacio() {
			System.out.println();
		}
		
		public void construirFlecha() {
			for (int i = 0; i < longitud; i++) {
				imprime("-");
			}
			imprime(">");
		}
		
		private void imprime(String simbolo) {
			if (color.equals("negro")) {
				System.out.print(simbolo);
			}else{
				System.err.print(simbolo);
			}
		}
	}

}
