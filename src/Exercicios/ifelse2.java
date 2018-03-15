package Exercicios;

import java.util.Scanner;


public class ifelse2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		double result, valor1, valor2, valor3, valor4;
		System.out.print("Digite um numero:");
		valor1 = entrada.nextInt();
		System.out.print("\nDigite outro numero:");
		valor2 = entrada.nextInt();
		System.out.print("\nDigite um numero:");
		valor3 = entrada.nextInt();
		System.out.print("\nDigite um numero:");
		valor4 = entrada.nextInt();
		
		result = (valor1+valor2+valor3+valor4)/4;
		System.out.print("\nA media dos valores e: "+ result);
		
		if (result > 7)
		{
			System.out.print("\nO aluno esta Aprovado");
		}
		else
		{
			System.out.println("\nO aluno esta Reprovado");
		
		}

	}

}
