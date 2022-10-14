package Forma3;

import javax.swing.JOptionPane;

public class Entidad {
	
//	En esta parte se crea dos metodos privados ladoA, ladoB y solo se podra visualizar en la clase Entidad.
	private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		
//		Aqui declaramos la variable cadena para mas adelante hacer su determinado proceso.
		String cadena;
		
//		Se pide la longitud de ladoA y ladoB de tipo texto.
		
		cadena = JOptionPane.showInputDialog( null, "Ingrese la longitud del lado A: " );
		
//		En esta parte se procede a tomar el dato la longitud del ladoA, almacenado en la variable cadena de tipo texto, para convertirla en un numero decimal.
		ladoA = Double.parseDouble( cadena );
		

		cadena = JOptionPane.showInputDialog( null, "Ingrese la longitud del lado B: " );
		
//		En esta parte se procede a tomar el dato la longitud del ladoB, almacenado en la variable cadena de tipo texto, para convertirla en un numero decimal.
		ladoB = Double.parseDouble( cadena );

	}
	
	public void calcularArea (){
		
//		En esta parte se declara la variable resultado para mas adelante hacer su proceso.
		double resultado;
		
//		Luego se hace la operacion de con las 2 variables: ladoA y ladoB
		resultado = ladoA * ladoB;
		
//		Por ultimo, se muestra una ventana teniendo como respuesta el proceso hecho anteriormente   
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
} // Fin de la clase Entidad

