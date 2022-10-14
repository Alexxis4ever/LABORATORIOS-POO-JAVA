package Forma1;
import javax.swing.JOptionPane;

public class Principal1 {

	public static void main(String[] args) {
		
//		Se crea la variable cadena de tipo texto, para mas adelante pedir informacion.
		String cadena;
		
//		Se crea la variable para el lado A de tipo decimal.
		double ladoA;
		
//		Se crea la variable para el lado B de tipo decimal.
		double ladoB;
		
//		Se crea la variable para el resultado de el lado A y B de tipo decimal
		double resultado;
		
		
//		Se pide el dato para la longitud del lado A en tipo texto.
		cadena = JOptionPane.showInputDialog( null, "Ingrese la longitud del lado A: " );
		
//		Aqui convertimos el dato ingresado anteriormente de tipo texto a numero para hacer los respectivos procesos.
		ladoA = Double.parseDouble( cadena );
		
		
//		Se pide el dato para la longitud del lado B en tipo texto.
		cadena = JOptionPane.showInputDialog( null, "Ingrese la longitud del lado B: " );
		
		
//		Aqui convertimos el dato ingresado anteriormente de tipo texto a numero para hacer los respectivos procesos.
		ladoB = Double.parseDouble( cadena );
		
		
//		En esta variable se hacen el proceso de hallar el area, respecto a la longitud A y B ingresada anteriormente.
		resultado = ladoA * ladoB;
		
		
//		Por ultimo lo que hacemos es imprimir el resultado o el area entre las 2 longitudes, hecho anteriormente.
		JOptionPane.showMessageDialog( null, "El resultado es: " + resultado );

	}

}
