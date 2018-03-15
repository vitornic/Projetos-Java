package Exercicios;

import java.util.Scanner;


public class comandofor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Digite o seu nome:");
		nome = Sc.nextLine();
		for (int i = 0; i < nome.length();i ++)
		{
			System.out.println(nome);
		}
	}

}
