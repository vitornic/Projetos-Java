package Exercicios;

import java.util.Scanner;


public class soma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int num1, num2;
		int soma;
		
		System.out.print("Digitar um numero:");
		num1 = entrada.nextInt();
		System.out.print("\nDigitar outro numero:");
		num2 = entrada.nextInt();
		soma = num1 + num2;
		System.out.print("\nA soma dos valores e: "+ soma);
		
		if (soma > 10)
		{
			System.out.println("\nA soma e maior que Dez");
		}
		else
		{
			System.out.println("\nA soma e menor que Dez");
		}

	}

}
