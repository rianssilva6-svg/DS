import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulacao {
    public static void main(String[] args) {

        // Criar Arquivo

        try {
            File arquivo = new File("arquivo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo Criado: "+arquivo.getName());
            }else {
                System.out.println("Arquivo ja existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escrever

        try {
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write("Ola, este e o conteudo inicial\n ");
            writer.write("Linha 2 do arquivo\n ");
            writer.close();
            System.out.println("Conteudo criado com sucesso");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: "+e.getMessage());
        }

        // Ler Arquivo

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            System.out.println("\n Conteudo do arquivo: ");
            while ((linha=reader.readLine())!=null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler: "+e.getMessage());
            e.printStackTrace();
        }

        // Alterar

        try {
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("Conteudo alterado\n");
            fw.write("Nova informacao no arquivo");
            fw.close();

            System.out.println("Arquivo alterado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao alterar: "+e.getMessage());
        }

        // Mostrar Conteudo Apos Alteracao
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            System.out.println("\n Conteudo apos alteracao:");
            while ((linha=br.readLine())!=null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler: "+e.getMessage());
            e.printStackTrace();
        }

        // Remover Arquivo
        File arquivo = new File("arquivo.txt");
        if (arquivo.delete()) {
            System.out.println("Arquivo removido");
        }else {
            System.out.println("Erro ao remover o arquivo");
        }
    }
}
