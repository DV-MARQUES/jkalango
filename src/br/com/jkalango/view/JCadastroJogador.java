package br.com.jkalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//extens e uma herança
public class JCadastroJogador extends JFrame {
    // Construtor inicializar os componentes do formulário
    public JCadastroJogador(){
        // Titulo da janela
        setTitle("Faça parte do JKalango");
        // Garante que aplicação não seja finalizada;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Dimensão da janela
        setSize(400,450);
        // Posição ao centro
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel IblNome = new JLabel("Nome: ");
        JTextField txtNome= new JTextField(30);
        
        JLabel IblNickname= new JLabel("NickName: ");
        JTextField txtNickName= new JTextField(30);
        
        JLabel IblEmail= new JLabel("Email: ");
        JTextField txtEmail= new JTextField(30);

        
        JLabel IblCelular= new JLabel("Celular: ");
        JTextField txtCelular= new JTextField(30);

        
        JLabel IblSenha= new JLabel("Senha: ");
        JTextField txtSenha= new JTextField(30);
        
        add(IblNome);
        add(txtNome);
        add(IblNickname);
        add(txtNickName);
        add(IblEmail);
        add(txtEmail);
        add(IblCelular);
        add(txtCelular);
        add(IblSenha);
        add(txtSenha);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);
        btnCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");

            
                        
            }   
            
        });
        setVisible(true);
    }
}
