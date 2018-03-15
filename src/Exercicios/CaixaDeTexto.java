package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class CaixaDeTexto extends JFrame{
	
	
	
	JTextField texto1 = new JTextField(10);
	JTextField texto2 = new JTextField(25);
	
	JTextField texto3 = new JTextField("ESCREVA SEU TEXTO AQUI!!",30);
	
	public CaixaDeTexto(){
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane.add(texto1);
		pane.add(texto2);
		pane.add(texto3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		CaixaDeTexto janela = new CaixaDeTexto();

	}

}
