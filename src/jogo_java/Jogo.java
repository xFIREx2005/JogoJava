/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Kaique
 */
public class Jogo extends JFrame{
    
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JLabel lb1;
    private JLabel lb2;     
    private JLabel lb3 ;  
    private JLabel lb4;  
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private static Jogo frame;
    
    public Jogo(){
        inicializarComponentes();
      
    }

    private void inicializarComponentes(){
        setTitle("Jogo");
        setBounds(0,0,250,200);
        setLayout(null);
        bt1 = new JButton("Bt1");
        bt2 = new JButton("Bt2");
        bt3 = new JButton("Bt3");
        lb1 = new JLabel("lb1");
        lb2 = new JLabel("lb2");
        lb3 = new JLabel("lb3");
        lb4 = new JLabel("lb4");
        bt4 = new JButton("Bt4");
        bt5 = new JButton("Bt5");
        bt6 = new JButton("Bt6");
        bt1.setBounds(30, 10, 50, 30);
        bt2.setBounds(90, 10, 50, 30);
        bt3.setBounds(150, 10, 50, 30);
        lb1.setBounds(45, 60, 50, 30);
        lb2.setBounds(85, 60, 50, 30);
        lb3.setBounds(125, 60, 50, 30);
        lb4.setBounds(165, 60, 50, 30);
        bt4.setBounds(30, 110, 50, 30);
        bt5.setBounds(90, 110, 50, 30);
        bt6.setBounds(150, 110, 50, 30);
        
        
        add(bt1);
        add(bt2);
        add(bt3);
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(bt4);
        add(bt5);
        add(bt6);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame = new Jogo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width)/2, 
                        (tela.height - frame.getSize().height)/2);
                frame.setVisible(true);
            }
        });
    }
    
}
