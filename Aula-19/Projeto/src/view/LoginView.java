package view;

import dao.UsuarioDao;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    
    private final UsuarioDao usuarioDao = new UsuarioDao();

    public LoginView() {
        setTitle("Acesso ao Sistema");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setLayout(new BorderLayout());

        criarInterface();
        configurarEventos();
    }

    private void criarInterface() {
        // Painel superior com título
        JLabel lblTitulo = new JLabel("LOGIN", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Painel central com os campos
        JPanel painelCampos = new JPanel(new GridLayout(2, 2, 10, 10));
        painelCampos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        painelCampos.add(new JLabel("Usuário:"));
        txtLogin = new JTextField();
        painelCampos.add(txtLogin);

        painelCampos.add(new JLabel("Senha:"));
        txtSenha = new JPasswordField();
        painelCampos.add(txtSenha);

        add(painelCampos, BorderLayout.CENTER);

        // Painel inferior com o botão
        JPanel painelBotoes = new JPanel();
        btnEntrar = new JButton("Entrar");
        btnEntrar.setPreferredSize(new Dimension(100, 30));
        painelBotoes.add(btnEntrar);

        add(painelBotoes, BorderLayout.SOUTH);
    }

    private void configurarEventos() {
        btnEntrar.addActionListener(e -> autenticar());
        
        // Permite logar apertando a tecla ENTER no campo de senha
        txtSenha.addActionListener(e -> autenticar());
    }

    private void autenticar() {
        String login = txtLogin.getText().trim();
        String senha = new String(txtSenha.getPassword());

        Usuario usuario = usuarioDao.autenticar(login, senha);

        if (usuario != null) {
            JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuario.getLogin() + "!", "Autenticação", JOptionPane.INFORMATION_MESSAGE);
            
            // Abre a tela de Produtos
            ProdutoView telaProduto = new ProdutoView();
            telaProduto.setVisible(true);
            
            // Fecha a tela de Login
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
            txtSenha.setText("");
            txtSenha.requestFocus();
        }
    }
}