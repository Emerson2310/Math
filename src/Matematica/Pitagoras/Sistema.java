package Matematica.Pitagoras;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		double b = 0;
		double c = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para calcular a hipotenusa digite tamanho do primeiro cateto: ");
		b = teclado.nextDouble();
		
		System.out.println("Agora digite o tamanho do segundo cateto: ");
		c = teclado.nextDouble();
		
		Formulas f1 = new Formulas(b, c);
		
		System.out.println(f1.toString());
		
		
		
		
		
		
		teclado.close();
	}
}
