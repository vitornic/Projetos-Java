package Exercicios;

public class contbre2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int contador = 1; contador <= 100; contador++){
			if (contador%5!=0)
				continue;
			System.out.println("Contador: "+ contador);
		}

	}

}
