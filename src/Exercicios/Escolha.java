package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Escolha extends JFrame{
   
	private JLabel label = new JLabel("Qual estilo musical voce prefere?");
	private JCheckBox checkPagode;
	private JCheckBox checkSertanejo;
	private JCheckBox checkEletronico;
	
	public Escolha(){
		
		checkPagode = new JCheckBox("Pagode");
		checkSertanejo = new JCheckBox("Sertanejo");
		checkEletronico = new JCheckBox("Eletronico");
		
		Container pane1 = this.getContentPane();
		JPanel pane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel pane3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		pane1.setLayout(new GridLayout(2,1));
		
		pane2.add(label);
		pane3.add(checkPagode);
		pane3  .add(checkSertanejo);
		pane3.add(checkEletronico);
		
		pane1.add(pane2);
		pane1.add(pane3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(310,120);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		Escolha janela = new Escolha();

	}

}
