import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();
        boolean execucao = true;

        String marca;
        String modelo;
        String ano;
        String modeloBusca;

        while (execucao) {
            String opcao = JOptionPane.showInputDialog(null,
            "===== Menu =====\n"+
            "1 - Cadastrar Carro\n"+
            "2 - Listar Carros\n"+
            "3 - Detalhar Carro\n"+
            "4 - Alterar Carro\n"+
            "5 - Excluir Carro\n"+
            "6 - Gravar Informações no Arquivo\n"+
            "7 - Sair"
            ,"Menu Principal",
            JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação Cancelada");
                break;
            }

            switch (opcao) {
                case "1":
                    marca = JOptionPane.showInputDialog(null,
                        "Digite a marca do carro: ",
                        "Cadastro de Carros",
                        JOptionPane.QUESTION_MESSAGE
                    );
                    modelo = JOptionPane.showInputDialog(null,
                        "Digite o modelo do carro: ",
                        "Cadastro de Carros",
                        JOptionPane.QUESTION_MESSAGE
                    );
                    ano = JOptionPane.showInputDialog(null,
                        "Digite o ano carro: ",
                        "Cadastro de Carros",
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (marca == null && modelo == null && ano == null) {
                        JOptionPane.showMessageDialog(null,
                        "Veiculo não cadastrado");
                    }
                    else {
                        listaCarros.add(new Carro(marca, modelo, ano));
                        JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!!");
                    }
                    break;

                case "2":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Carro Cadastrado!!");
                    }
                    else {
                        for (Carro carro : listaCarros) {
                            carro.exibirDados();
                        }
                    }
                    break;

                case "3":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Carro Cadastrado!!");
                    }
                    else {
                        modelo = JOptionPane.showInputDialog(null,
                            "Digite o modelo do carro: ",
                            "Consulta de Carros",
                            JOptionPane.QUESTION_MESSAGE
                        );

                        for (Carro carro : listaCarros) {
                            if (carro.getModelo().equalsIgnoreCase(modelo)) {
                                carro.exibirDados();
                            }
                        }
                    }
                    break;

                case "4":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Carro Cadastrado!!");
                    }
                    else {
                        modeloBusca = JOptionPane.showInputDialog(null,
                            "Digite o modelo do carro: ",
                            "Atualizar Carro",
                            JOptionPane.QUESTION_MESSAGE
                        );
                        for (Carro carro : listaCarros) {
                            if (carro.getModelo().equalsIgnoreCase(modeloBusca)) {
                                    marca = JOptionPane.showInputDialog(null,
                                    "Digite a marca do carro: ",
                                    "Cadastro de Carros",
                                    JOptionPane.QUESTION_MESSAGE
                                );
                                    modelo = JOptionPane.showInputDialog(null,
                                    "Digite o modelo do carro: ",
                                    "Cadastro de Carros",
                                    JOptionPane.QUESTION_MESSAGE
                                );
                                    ano = JOptionPane.showInputDialog(null,
                                    "Digite o ano carro: ",
                                    "Cadastro de Carros",
                                    JOptionPane.QUESTION_MESSAGE
                                );
                                carro.setMarca(marca);
                                carro.setModelo(modelo);
                                carro.setAno(ano);
                                JOptionPane.showMessageDialog(null,
                                "Carro atualizado com sucesso");
                                break;
                            }
                        }
                    }
                    break;

                case "5":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Carro Cadastrado!!");
                    }
                    else {
                        String modeloExcluir = JOptionPane.showInputDialog(null,
                            "Digite o modelo do carro que deseja excluir: ",
                            "Excluir Carro",
                            JOptionPane.QUESTION_MESSAGE
                        );

                        Boolean removido = listaCarros.removeIf(carro -> carro.getModelo().equalsIgnoreCase(modeloExcluir));

                        if (removido) {
                            JOptionPane.showMessageDialog(null, "Carro removido com sucesso");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum carro encontrado com esse modelo.");
                        }
                    }
                    break;

                case "6":
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Carro Cadastrado!!");
                    }
                    else{
                        try (FileWriter fileWriter = new FileWriter("carros.txt");
                            PrintWriter printWriter = new PrintWriter(fileWriter)) {

                            for (Carro carro : listaCarros) {
                                printWriter.println(carro.getMarca() + "," + carro.getModelo() + "," + carro.getAno());
                            }
                            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso em 'carros.txt'");

                        }
                        catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo: " + e.getMessage());
                        }
                    }
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    execucao = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                    "Opção Inválida!!");
                    break;
            }
        }
    }
}
