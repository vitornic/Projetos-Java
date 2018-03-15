package Exercicios;

public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte fixo=9, mult=1;
		int result=1;
		 
		do{
			result=fixo*mult;
			System.out.println(fixo + "x" + mult + "=" + result);
			mult++;
	      }
		while (mult<=fixo+1); 

	}

}
