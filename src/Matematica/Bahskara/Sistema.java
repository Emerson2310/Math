package Matematica.Bahskara;

import java.util.Scanner;

public class Sistema {
 
	public static void main(String[] args) {
		
		double a = 0; 
		double b = 0; 
		double c = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os valores de: \n A= ");
		a = teclado.nextDouble();
		
		System.out.println(" B = ");
		b = teclado.nextDouble();
		
		System.out.println(" C = ");
		c = teclado.nextDouble();
		
		Formulas f1 = new Formulas(a, b, c);
	
		System.out.println(f1.toString());
		
		
		
		
		teclado.close();
		
	}
}
