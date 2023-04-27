package Matematica.Calc;

import java.util.Scanner;

public class Calculadora_01 {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double a = teclado.nextDouble();
		
		System.out.println("Digite mais um número");
		double b = teclado.nextDouble();
		
		System.out.println("Digite a operação a ser realizada entre eles: ");
		String c = teclado.next();
		
		
		if(c.equals("+")) {
			System.out.println(a + b);
		}else if(c.equals("-")) {
			System.out.println(a - b);
		}else if(c.equals("*") || c.equalsIgnoreCase("X")) {
			System.out.println(a * b);
		}else if(c.equalsIgnoreCase("%")) {
			System.out.println(a % b);
		}else {
			System.out.println("OPERAÇÃO NÃO ENCONTRADA!!!");
		}
		
		
		
		teclado.close();
	}
}
