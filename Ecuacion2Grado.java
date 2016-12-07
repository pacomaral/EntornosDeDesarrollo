/**
 * 	Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
 *	debe indicarlo.
 */

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		
		//Variables
		double a, b, c, x1, x2, det;									//Se utiliza double para poder hacer raíces -> Math.sqrt(double x) 
		String resultado;
		
		//Input
		Scanner teclado = new Scanner(System.in);
		System.out.println("A: ");
		a = teclado.nextFloat();
		System.out.println("B: ");
		b = teclado.nextFloat();
		System.out.println("C: ");
		c = teclado.nextFloat();
		
		//Proceso
		det = (b * b) - 4 * a * c;
		
		if (det < 0){
			resultado = "No existen soluciones reales";
		}
		else if (det == 0){
			x1 = -b / (2 * a);
			resultado = "Sólo existe una solución real. x1 = " + x1;
		}
		else{
			x1 = (-b + Math.sqrt(det))/(2 * a);
			x2 = (-b - Math.sqrt(det))/(2 * a);
			resultado = "x1 = " + x1 + " || x2 = " + x2;
		}
		
		//Output
		System.out.println(resultado);
		

	}

}
