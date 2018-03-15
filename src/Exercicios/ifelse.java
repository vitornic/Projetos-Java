package Exercicios;

import java.awt.SystemTray;


public class ifelse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   double result, valor1, valor2, valor3, valor4;  
	   
	   valor1 = 5.0;
	   valor2 = 7.0;
	   valor3 = 8.0;
	   valor4 = 9.0;
	   result = (valor1+valor2+valor3+valor4)/4;
	   
	   if (result>7.0){
		   System.out.println("A media foi de "+ result + " e o aluno foi aprovado");
		   
	   }else{
		   System.out.println("A media foi de "+ result + " e o aluno foi reprovado");
	   }

	}

}
