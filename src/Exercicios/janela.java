package Exercicios;

import javax.swing.JFrame;


public class janela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha primeira janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(800,600);
		janela.setVisible(true);

	}

}
