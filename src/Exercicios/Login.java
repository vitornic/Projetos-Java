package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Login extends JFrame {
       
	private JLabel labelNome;
	private JLabel labelSenha;
	private JLabel labelComent;
	private JTextField textNome;
	
	private JPasswordField textSenha;
	private JTextArea textComent;
	private JButton buttonOk;
	private JButton buttonCancelar;
	private JScrollPane paneComent;
	
	public Login(){
	
	super("Exemplo pratico - Interface Login");
	
	labelNome = new JLabel("Nome");
	labelSenha = new JLabel("Senha");
	labelComent = new JLabel("Comentario");
	
	textNome = new JTextField(25);
	textSenha = new JPasswordField(25);
	
	textSenha.setEchoChar('*');
	textComent = new JTextArea(10,25);
	textComent.setLineWrap(true);
	
	paneComent = new JScrollPane(textComent,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	buttonOk = new JButton("OK");
	buttonCancelar = new JButton("Cancelar");
	
	Container pane = this.getContentPane();
	
	pane.setLayout(new FlowLayout(FlowLayout.LEFT));
	
	pane.add(labelNome);
	pane.add(textNome);
	pane.add(labelSenha);
	pane.add(textSenha);
	pane.add(labelComent);
	pane.add(paneComent);
	pane.add(buttonOk);
	pane.add(buttonCancelar);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(310,380);
	this.setResizable(false);
	this.setVisible(true);
}
	
	public static void main(String[] args) {
		Login janela = new Login();

	}

}
