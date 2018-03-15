package Exercicios;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class label extends JFrame{

	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4 = new JLabel ("Rotulo 4 ",JLabel.CENTER);
	
	public label(){
		
	    label1 = new JLabel("testando rotulos com JAVA");
		
		label2 = new JLabel("Texto Centralizado", JLabel.CENTER);
		
		label3 = new JLabel("Java - Interface Grafica",JLabel.RIGHT);
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(4,1));
		pane.add(label1);
		pane.add(label2);
		pane.add(label3);
		pane.add(label4);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		this.setVisible(true);
	
	
}

	public static void main(String[] args) {
		label janela = new label();
	

	}

}
