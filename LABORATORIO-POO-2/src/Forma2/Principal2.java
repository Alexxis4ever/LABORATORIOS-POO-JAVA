package Forma2;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {
		
//		Se crea la variable para el lado A de tipo decimal
		double ladoA;
//		Se crea la variable para el lado A de tipo decimal		
		double ladoB;
		
//		Se piden los datos de la variable A, desde el metodo ingresar datos el cual recibe un mensaje, luego este metodo nos retorna el valor dado a estos atributos.
		ladoA = ingresarDatos ( "Ingrese la longitud del lado A: " );
		
//		Se piden los datos de la variable A, desde el metodo ingresar datos el cual recibe un mensaje, luego este metodo nos retorna el valor dado a estos atributos.
		ladoB = ingresarDatos ( "Ingrese la longitud del lado B: " );
		
//		Se envian los datos obtneidos a el metodo calcularArea para hacer el proceso.
		calcularArea ( ladoA, ladoB );
	}
	
//	El metodo recibe el mensaje enviado anteriormente
	
	private static double ingresarDatos(String mensaje) {
		
		String cadena;
		double valor;
		
//		Se crea una variable cadena de tipo texta, la cual recibira un mensaje y enviara los datos almacenados.
		cadena = JOptionPane.showInputDialog(null, mensaje);
		
//		Esta variable valor lo que hace es convertir por un metodo de tipo texto a un numero decimal.
		valor = Double.parseDouble( cadena );
		
//		Este proceso lo que hace es asignar el valor a las variables ladoA y ladoB.
		return valor;
	}
	
	
	private static void calcularArea(double a, double b) {
		
//		Se crea una variable resultado para hacer la operacion de hallar el area
		double resultado;
		
//		Se hace la operacion recibiendo un parametro a y b de tipo decimal.
		resultado = a * b;
		
		
//		Por ultimo esta parte lo que hace es mostrarnos un mensaje respecto a el resultado de la operacion anterior.
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		// Fin de la clase Aplicación.
	}
}
