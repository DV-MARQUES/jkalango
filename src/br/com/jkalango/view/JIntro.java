package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
    import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class JIntro extends JFrame{
    public JIntro(){
        setTitle("O Eco Obscuro do Cerrado");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        String textoLabel = "\t"+"No Cerrado Encantado, a vida virou pesadelo."+ '\n' +
                            "Um \"Objeto Corrompido\" emergiu, deturpando as classes de JKalangos, JAbelhinhas e JFormigas. \n"+
                            "Agora, suas instâncias se tornaram aberrações: Kalangos lentos e falhos, Abelhinhas espalhando doença com seus métodos malignos, e Formigas com a herança de organização perdida, agindo em um terror caótico. \n"+
                            "O Cerrado grita. Apenas a descompilação dessa escuridão pode trazer esperança.";
        
        
        JOptionPane.showMessageDialog(null, textoLabel);
        
        
    JButton startButton = new JButton("Iniciar primeira Missão");
    add(startButton);

    startButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(JIntro.this,"Primeira Missão Iniciada");
        }   
        
    });

    }
    
}
