package Exercicios;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class BarraDeMenus extends JFrame{
	
	private JMenuItem menuItemAbrir = new JMenuItem("Abrir");
	private JMenuItem menuItemNovo = new JMenuItem("Novo");
	private JMenuItem menuItemSalvar = new JMenuItem("Salvar");
	private JMenuItem menuItemFechar = new JMenuItem("Fechaar");
	
	private JMenuItem menuItemColar = new JMenuItem("Colar");
	private JMenuItem menuItemCopiar = new JMenuItem("Copiar");
	private JMenuItem menuItemRecortar = new JMenuItem("Recortar");
	
	private JMenuItem menuItemSubstituir = new JMenuItem("Substituir");
	private JMenuItem menuItemLocalizar = new JMenuItem("Localizar");
	
	private JMenu menuArquivo = new JMenu("Arquivo");
	
	private JMenu menuEditar = new JMenu("Editar");
	
	private JMenuBar menuBar = new JMenuBar();

    public BarraDeMenus(){
    	
    	super("MENUS");
    	
    	menuArquivo.add(menuItemAbrir);
    	menuArquivo.add(menuItemNovo);
    	menuArquivo.add(menuItemSalvar);
    	menuArquivo.addSeparator();
    	menuArquivo.add(menuItemFechar);
    	
    	menuEditar.add(menuItemColar);
    	menuEditar.add(menuItemCopiar);
    	menuEditar.add(menuItemRecortar);
    	menuEditar.addSeparator();
    	menuEditar.add(menuItemLocalizar);
    	menuEditar.add(menuItemSubstituir);
    	
    	menuBar.add(menuArquivo);
    	menuBar.add(menuEditar);
    	
    	this.setJMenuBar(menuBar);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(310,200);
    	this.setVisible(true);
    	
    }
	private void setJMenuBar(JMenu menuBar2) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		BarraDeMenus exemplo = new BarraDeMenus();

	}
}
