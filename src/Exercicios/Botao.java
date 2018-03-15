package Exercicios;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Botao extends JFrame{
	JButton button1 = new JButton("Abrir");
	JButton button2 = new JButton("Novo");
	JButton button3 = new JButton("Fechar");
	
	
	
	public Botao(){
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,150);
		this.setVisible(true);
		this.setBackground(Color.YELLOW);
	}
	
	public static void main(String[] args) {
	Botao janela = new Botao();

	}

}
