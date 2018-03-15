package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class nova extends JFrame{
	
	JButton button1 = new JButton("Abrir");
	JButton button2 = new JButton("Novo");
	JButton button3 = new JButton("Fechar");
	
	public nova(){
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,150);
		this.setVisible(true);
	
	JTextField texto1 = new JTextField(10);
	JTextField texto2 = new JTextField(25);
	
	JTextField texto3 = new JTextField("ESCREVA SEU TEXTO AQUI!!",30);
	

		Container pane1 = this.getContentPane();
		pane1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane1.add(texto1);
		pane1.add(texto2);
		pane1.add(texto3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		nova janela = new nova();

	}

}