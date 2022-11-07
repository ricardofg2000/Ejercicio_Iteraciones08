package unico;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 Pedir un número y calcular su factorial. 
		 Ejemplo: Factorial de 5:  5! = 5 x 4 x 3 x 2 x 1 = 120
		 */

		Scanner leer = new Scanner (System.in);
		int num;
		String mensaje;
		int resulFactorial = 1;
		
		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(leer.nextLine());
		
		mensaje = "Factorial de " + num + ": " + num +"! = ";
		
		for(int i = num; i == 1; i--) {
			resulFactorial = resulFactorial * i ;
			mensaje += i;
			if (i != 1) {
				mensaje += " x ";
			}
			
		}
		mensaje += " = " + resulFactorial;
		System.out.print(mensaje);
		
		
	}
}
