package Exercicios;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo extends JFrame{
   
    private JButton mensagem;
	private JButton fechar;
	
	public Dialogo(){
	
	super("TESTE DE	OptionPane");
	
	mensagem = new JButton("Mensagem");
	fechar = new JButton("Fechar");
	
	Container pane = this.getContentPane();
	
	pane.add(mensagem);
	pane.add(fechar);
	
	pane.setLayout(null);
	
	mensagem.setBounds(10,30,100,22);
	fechar.setBounds(10,60,100,22);
	
	mensagem.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	buttonMensagemActionPerformed(e);
	}
	});
	
	fechar.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	buttonConfirmaActoinPerformed(e);
	}
	});
	
	this.setSize(250,210);
	this.setContentPane(pane);
	this.setVisible(true);
	}

	private void buttonMensagemActionPerformed(ActionEvent e){
	JOptionPane.showMessageDialog(this,"ISSO EH UM TESTE",
	"FUNCIONA!",JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void buttonConfirmaActoinPerformed(ActionEvent e){
	int ret = JOptionPane.showConfirmDialog(this,
	"Deseja fechar?",
	"Fechar",
	JOptionPane.OK_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE);
	
	if(ret == JOptionPane.OK_OPTION){
	System.exit(0);
	}}
	
	public static void main(String[] args){
	Dialogo p = new Dialogo();
	}}
