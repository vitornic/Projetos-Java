package Exercicios;

import java.util.Scanner;


public class exemploswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int diaDaSemana;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digitar um numero correspondente ao dia da Semana\n");
		diaDaSemana = entrada.nextInt();
		switch (diaDaSemana){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terca-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");   
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			default:
				System.out.println("Este nao e um dia valido!");
		}

	}

}
