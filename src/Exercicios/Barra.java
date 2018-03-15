package Exercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Barra extends JFrame {

    JTextArea texto1 = new JTextArea(15,30);

    JScrollPane scrollpane = new JScrollPane(texto1);

    public Barra(){

        Container pane = this.getContentPane();
        pane.setLayout((LayoutManager) new FlowLayout(FlowLayout.CENTER));

        texto1.setLineWrap(true);

        scrollpane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        scrollpane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pane.add(scrollpane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,320);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Barra janela = new Barra();
    }
}
