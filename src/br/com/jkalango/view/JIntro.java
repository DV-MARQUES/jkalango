package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
    import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JIntro extends JFrame{
    public JIntro(){
        setTitle("O Eco Obscuro do Cerrado");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        String textoLabel = "<html>No Cerrado Encantado, a vida virou pesadelo<br>"
                            + "Um Objeto Corrompido emergiu, deturpando as classes de JKalangos, JAbelhinhas e JFormigas.<br>"
                            + "Agora, suas instâncias se tornaram aberrações:<br>"
                            + "Kalangos lentos e falhos, Abelhinhas espalhando doença com seus métodos malignos, e Formigas com a herança de organização perdida, agindo em um terror caótico.<br>"
                            + "O Cerrado grita. Apenas a descompilação dessa escuridão pode trazer esperança.</html>";

         
        JLabel janela = new JLabel(textoLabel);
        janela.setOpaque(false);
        janela.setForeground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(janela); 


        JButton startButton = new JButton("Iniciar primeira Missão");
        panel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(JIntro.this, "Primeira Missão Iniciada");
                dispose();
                new JCadastroJogador();
            }
        });
        setContentPane(panel);
        setVisible(true);
    }


    }
    
    

