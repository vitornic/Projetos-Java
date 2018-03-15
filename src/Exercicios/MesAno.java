package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MesAno extends JFrame{
	
	private JLabel labelMes = new JLabel ("Informe o Mes:");
	private JLabel labelAno = new JLabel ("Informe o Ano:");
	private JComboBox comboMes = new JComboBox();
	private JComboBox comboAno = new JComboBox();

	public MesAno(){
		
		super("Testando JComboBox");
		Container pane1 = this.getContentPane();
		pane1.setLayout(new GridLayout(2,1));
		
		JPanel pane2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel pane3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		comboMes.addItem("JANEIRO");comboMes.addItem("FEVEREIRO");
		comboMes.addItem("MARCO");comboMes.addItem("ABRIL");
		comboMes.addItem("MAIO");comboMes.addItem("JUNHO");
		comboMes.addItem("JULHO");comboMes.addItem("AGOSTO");
		comboMes.addItem("SETEMBRO");comboMes.addItem("OUTUBRO");
		comboMes.addItem("NOVEMBRO");comboMes.addItem("DEZEMBRO");
		
		for (int i = 2000;i <= 2020; i++);
		
		pane2.add(labelMes);
		pane2.add(comboMes);
		pane3.add(labelAno);
		pane3.add(comboAno);
		pane1.add(pane2);
		pane1.add(pane3);
		
		System.out.println(comboMes.getItemAt(6)+ "/" + comboAno.getItemAt(18));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(310,120);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MesAno exemplo = new MesAno();

	}

}
