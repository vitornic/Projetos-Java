package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class AreaComentario extends JFrame{

    JTextArea texto1 = new JTextArea(5,30);
    JTextArea texto2 = new JTextArea("Comentários",10,30);

    public AreaComentario(){

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(texto1);
        pane.add(texto2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,320);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        AreaComentario janela = new AreaComentario();

    }
}
