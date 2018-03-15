import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class CorBotao extends JFrame{
	
	public CorBotao(){
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		final JButton btn_botao = new JButton("Botao");
	
		btn_botao.setBackground(Color.YELLOW);
		
		btn_botao.addMouseListener(new MouseAdapter() {
		
		
			public void mouseExited(MouseEvent e){
				btn_botao.setBackground(Color.WHITE);
				}
	        
			public void mouseEntered(MouseEvent e){
				btn_botao.setBackground(Color.GREEN);
			
		
		}
		});
		add(btn_botao);
	}
		
		
	public static void main(String[] args) {
	CorBotao janela = new CorBotao();
	
		
	}}
