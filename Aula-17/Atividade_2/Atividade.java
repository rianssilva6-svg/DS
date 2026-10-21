import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Atividade {
    public static void main(String[] args) {

        new File("LABORATORIO").mkdir();

        boolean execucao = true;
        String nome;
        File arquivo;

        while (execucao) {
            String opcao = JOptionPane.showInputDialog(null,
            "===== Menu =====\n"+
            "1 - Criar arquivo\n"+
            "2 - Escrever no arquivo\n"+
            "3 - Ler arquivo\n"+
            "4 - Renomear arquivo\n"+
            "5 - Excluir arquivo\n"+
            "6 - Mostrar informações do arquivo\n"+
            "7 - Sair\n"+
            "8 - Proteger arquivo (Somente Leitura)"
            ,"Gerenciador",
            JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação Cancelada");
                break;
            }

            switch (opcao) {
                case "1":
                    nome = JOptionPane.showInputDialog("Nome do arquivo (ex: teste.txt):");
                    arquivo = new File("LABORATORIO/" + nome);
                    try {
                        if (arquivo.createNewFile()) {
                            JOptionPane.showMessageDialog(null, "Arquivo criado!");
                        } else {
                            JOptionPane.showMessageDialog(null, "O arquivo já existe.");
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                    break;

                case "2":
                    nome = JOptionPane.showInputDialog("Nome do arquivo para escrever:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        String texto = JOptionPane.showInputDialog("Digite o texto:");
                        try {
                            FileWriter writer = new FileWriter(arquivo, true);
                            writer.write(texto + "\n");
                            writer.close();
                            JOptionPane.showMessageDialog(null, "Texto gravado!");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                case "3":
                    nome = JOptionPane.showInputDialog("Nome do arquivo para ler:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
                            String linha;
                            String conteudo = "";
                            while ((linha = reader.readLine()) != null) {
                                conteudo += linha + "\n";
                            }
                            reader.close();
                            JOptionPane.showMessageDialog(null, conteudo);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                case "4":
                    nome = JOptionPane.showInputDialog("Nome atual do arquivo:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        String novoNome = JOptionPane.showInputDialog("Novo nome do arquivo:");
                        File novoArquivo = new File("LABORATORIO/" + novoNome);
                        if (arquivo.renameTo(novoArquivo)) {
                            JOptionPane.showMessageDialog(null, "Arquivo renomeado!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao renomear.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                case "5":
                    nome = JOptionPane.showInputDialog("Nome do arquivo para excluir:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        int resp = JOptionPane.showConfirmDialog(null, "Excluir o arquivo " + nome + "?", "Aviso", JOptionPane.YES_NO_OPTION);
                        if (resp == JOptionPane.YES_OPTION) {
                            arquivo.delete();
                            JOptionPane.showMessageDialog(null, "Arquivo excluido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                case "6":
                    nome = JOptionPane.showInputDialog("Nome do arquivo:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        String info = "Nome: " + arquivo.getName() + "\n" +
                                      "Tamanho: " + arquivo.length() + " bytes\n" +
                                      "Caminho: " + arquivo.getAbsolutePath() + "\n" +
                                      "Pode ler: " + arquivo.canRead() + "\n" +
                                      "Pode gravar: " + arquivo.canWrite();
                        JOptionPane.showMessageDialog(null, info);
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    execucao = false;
                    break;

                case "8":
                    nome = JOptionPane.showInputDialog("Nome do arquivo para proteger:");
                    arquivo = new File("LABORATORIO/" + nome);
                    if (arquivo.exists()) {
                        arquivo.setReadOnly();
                        JOptionPane.showMessageDialog(null, "Arquivo agora é somente leitura!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}
