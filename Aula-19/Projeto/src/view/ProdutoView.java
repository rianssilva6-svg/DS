package view;

import dao.ProdutoDao;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class ProdutoView extends JFrame {

    // Instância direta do DAO (substituindo o Controle do exemplo base)
    private final ProdutoDao dao = new ProdutoDao();

    // Componentes da interface
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtPreco;
    private JTextField txtCategoria;
    private JTextField txtQuantidade;

    private JButton btnCadastrar;
    private JButton btnBuscar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnListar;
    private JButton btnLimpar;

    private JTable tabela;
    private DefaultTableModel modeloTabela;

    // Construtor da interface
    public ProdutoView() {
        setTitle("Gerenciamento de Produtos");
        setSize(850, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        criarInterface();
        configurarEventos();
        atualizarTabela();
    }

    // Cria todos os componentes da interface
    private void criarInterface() {

        // Título
        JLabel titulo = new JLabel(
                "GERENCIAMENTO DE PRODUTOS",
                SwingConstants.CENTER
        );
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(30, 60, 100));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        add(titulo, BorderLayout.NORTH);

        // Painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 15, 15, 15));
        add(painelPrincipal, BorderLayout.CENTER);

        // Painel de cadastro
        JPanel painelCadastro = new JPanel(new GridBagLayout());
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Dados do Produto"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelCadastro.add(new JLabel("ID:"), gbc);
        txtId = new JTextField(15);
        gbc.gridx = 1;
        painelCadastro.add(txtId, gbc);

        // Nome
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelCadastro.add(new JLabel("Nome:"), gbc);
        txtNome = new JTextField(25);
        gbc.gridx = 1;
        painelCadastro.add(txtNome, gbc);

        // Preço
        gbc.gridx = 0;
        gbc.gridy = 2;
        painelCadastro.add(new JLabel("Preço (R$):"), gbc);
        txtPreco = new JTextField(15);
        gbc.gridx = 1;
        painelCadastro.add(txtPreco, gbc);

        // Categoria
        gbc.gridx = 0;
        gbc.gridy = 3;
        painelCadastro.add(new JLabel("Categoria:"), gbc);
        txtCategoria = new JTextField(25);
        gbc.gridx = 1;
        painelCadastro.add(txtCategoria, gbc);

        // Quantidade
        gbc.gridx = 0;
        gbc.gridy = 4;
        painelCadastro.add(new JLabel("Quantidade:"), gbc);
        txtQuantidade = new JTextField(15);
        gbc.gridx = 1;
        painelCadastro.add(txtQuantidade, gbc);

        painelPrincipal.add(painelCadastro, BorderLayout.NORTH);

        // Tabela de produtos
        modeloTabela = new DefaultTableModel(
                new Object[]{"ID", "Nome", "Preço", "Categoria", "Quantidade"}, 0
        ) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false; 
            }
        };

        tabela = new JTable(modeloTabela);
        tabela.setRowHeight(25);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBorder(BorderFactory.createTitledBorder("Produtos Cadastrados"));
        painelPrincipal.add(scroll, BorderLayout.CENTER);

        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnCadastrar = new JButton("Cadastrar");
        btnBuscar = new JButton("Buscar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnListar = new JButton("Listar");
        btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnBuscar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnListar);
        painelBotoes.add(btnLimpar);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);
    }

    // Configura os eventos dos botões e da tabela
    private void configurarEventos() {
        btnCadastrar.addActionListener(e -> cadastrar());
        btnBuscar.addActionListener(e -> buscar());
        btnAlterar.addActionListener(e -> alterar());
        btnExcluir.addActionListener(e -> excluir());
        btnListar.addActionListener(e -> atualizarTabela());
        btnLimpar.addActionListener(e -> limparCampos());

        // Preenche os campos ao selecionar um produto na tabela
        tabela.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabela.getSelectedRow() != -1) {
                int linha = tabela.convertRowIndexToModel(tabela.getSelectedRow());

                txtId.setText(modeloTabela.getValueAt(linha, 0).toString());
                txtNome.setText(modeloTabela.getValueAt(linha, 1).toString());
                txtPreco.setText(modeloTabela.getValueAt(linha, 2).toString());
                txtCategoria.setText(modeloTabela.getValueAt(linha, 3).toString());
                txtQuantidade.setText(modeloTabela.getValueAt(linha, 4).toString());
            }
        });
    }

    // CADASTRAR PRODUTO
    private void cadastrar() {
        try {
            int id = lerId();
            String nome = lerTexto(txtNome, "Informe o nome do produto!");
            double preco = lerPreco();
            String categoria = lerTexto(txtCategoria, "Informe a categoria do produto!");
            int quantidade = lerQuantidade();

            if (dao.buscar(id) != null) {
                mostrarMensagem("ID já cadastrado!");
                return;
            }

            // Instancia o modelo e seta os valores
            Produto produto = new Produto();
            produto.setId(id);
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setCategoria(categoria);
            produto.setQuantidade(quantidade);

            dao.cadastrar(produto);
            mostrarMensagem("Produto cadastrado com sucesso!");
            atualizarTabela();
            limparCampos();

        } catch (IllegalArgumentException ex) {
            mostrarErro(ex.getMessage());
        }
    }

    // BUSCAR PRODUTO
    private void buscar() {
        try {
            int id = lerId();
            Produto produto = dao.buscar(id);

            if (produto != null) {
                txtNome.setText(produto.getNome());
                txtPreco.setText(String.valueOf(produto.getPreco()));
                txtCategoria.setText(produto.getCategoria());
                txtQuantidade.setText(String.valueOf(produto.getQuantidade()));
                mostrarMensagem("Produto encontrado!");
            } else {
                mostrarMensagem("Produto não encontrado!");
            }
        } catch (IllegalArgumentException ex) {
            mostrarErro(ex.getMessage());
        }
    }

    // ALTERAR PRODUTO
    private void alterar() {
        try {
            int id = lerId();
            String nome = lerTexto(txtNome, "Informe o nome do produto!");
            double preco = lerPreco();
            String categoria = lerTexto(txtCategoria, "Informe a categoria!");
            int quantidade = lerQuantidade();

            boolean alterado = dao.alterar(id, nome, preco, categoria, quantidade);

            if (alterado) {
                mostrarMensagem("Produto alterado com sucesso!");
                atualizarTabela();
                limparCampos();
            } else {
                mostrarMensagem("Produto não encontrado!");
            }
        } catch (IllegalArgumentException ex) {
            mostrarErro(ex.getMessage());
        }
    }

    // EXCLUIR PRODUTO
    private void excluir() {
        try {
            int id = lerId();
            Produto produto = dao.buscar(id);

            if (produto == null) {
                mostrarMensagem("Produto não encontrado!");
                return;
            }

            int opcao = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir o produto?",
                    "Confirmar Exclusão",
                    JOptionPane.YES_NO_OPTION
            );

            if (opcao == JOptionPane.YES_OPTION) {
                boolean removido = dao.remover(id);
                if (removido) {
                    mostrarMensagem("Produto excluído com sucesso!");
                    atualizarTabela();
                    limparCampos();
                }
            }
        } catch (IllegalArgumentException ex) {
            mostrarErro(ex.getMessage());
        }
    }

    // LISTAR PRODUTOS NA TABELA
    private void atualizarTabela() {
        modeloTabela.setRowCount(0);

        if (dao.listar() != null) {
            for (Produto produto : dao.listar()) {
                modeloTabela.addRow(new Object[]{
                        produto.getId(),
                        produto.getNome(),
                        produto.getPreco(),
                        produto.getCategoria(),
                        produto.getQuantidade()
                });
            }
        }
    }

    // LIMPAR CAMPOS
    private void limparCampos() {
        tabela.clearSelection();
        txtId.setText("");
        txtNome.setText("");
        txtPreco.setText("");
        txtCategoria.setText("");
        txtQuantidade.setText("");
        txtId.requestFocusInWindow();
    }

    // VALIDAR ID
    private int lerId() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            if (id <= 0) {
                throw new NumberFormatException();
            }
            return id;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Informe um ID numérico válido e positivo!");
        }
    }

    // VALIDAR PREÇO
    private double lerPreco() {
        try {
            double preco = Double.parseDouble(txtPreco.getText().trim().replace(",", "."));
            if (preco < 0) {
                throw new NumberFormatException();
            }
            return preco;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Informe um preço numérico válido!");
        }
    }

    // VALIDAR QUANTIDADE
    private int lerQuantidade() {
        try {
            int quantidade = Integer.parseInt(txtQuantidade.getText().trim());
            if (quantidade < 0) {
                throw new NumberFormatException();
            }
            return quantidade;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Informe uma quantidade numérica válida!");
        }
    }

    // MÉTODO GENÉRICO PARA VALIDAR TEXTOS (Nome, Categoria)
    private String lerTexto(JTextField campo, String mensagemErro) {
        String texto = campo.getText().trim();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException(mensagemErro);
        }
        return texto;
    }

    // MENSAGEM DE SUCESSO OU INFORMAÇÃO
    private void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    // MENSAGEM DE ERRO
    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}