import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = -1;
        String escrever;

        while (op!=0) {
            try{
                System.out.println("===== Menu =====");
                System.out.println("1 - Criar Arquivo");
                System.out.println("2 - Escrever no Arquivo");
                System.out.println("3 - Ler Arquivo");
                System.out.println("4 - Alterar Arquivo");
                System.out.println("5 - Remover Arquivo");
                System.out.println("0 - sair");
                System.out.print("Escolha: ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        try{
                            System.out.println("===== Criar Arquivo =====");
                            File arquivo = new File("arquivo.txt");
                            if (arquivo.createNewFile()) {
                                System.out.println("Arquivo Criado: "+arquivo.getName());
                            }
                            else {
                                System.out.println("Arquivo ja existe");
                            }
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        try {
                            FileWriter writer = new FileWriter("arquivo.txt",true);
                            System.out.print("Digite algo para escrever no arquivo: ");
                            escrever = sc.next();
                            writer.write(escrever+"\n");
                            writer.close();
                            System.out.println("Conteudo Criado com Sucesso");
                        } catch (IOException e) {
                            System.out.println("Erro ao escrever: "+e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
                            String linha;

                            System.out.println("Conteudo do arquivo: ");
                            while ((linha=reader.readLine())!=null) {
                                System.out.println(linha);
                            }
                            reader.close();
                        }catch (IOException e) {
                            System.out.println("Erro ao ler: "+e.getMessage());
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        try {
                        FileWriter fw = new FileWriter("arquivo.txt");
                        System.out.print("Digite algo para ser alterado: ");
                        escrever = sc.next();
                        fw.write(escrever);
                        fw.close();
                        System.out.println("Arquivo alterado com sucesso");
                    }
                    catch (IOException e) {
                        System.out.println("Erro ao alterar: "+e.getMessage());
                    }
                        break;
                    case 5:
                        File arquivo = new File("arquivo.txt");
                        if (arquivo.delete()) {
                            System.out.println("Arquivo removido");
                        }else {
                            System.out.println("Erro ao remover o arquivo");
                        }
                        break;

                    case 0:
                        System.out.println("Sistema Finalizado...");
                        break;

                    default:
                        System.out.println("Valor invalido!! Tente novamente");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Erro: Entrada de dados invalida!!");
                sc.nextLine();
            }catch(Exception e) {
                System.out.println("Erro: "+e.getMessage());
                sc.nextLine();
            }
        }
        sc.close();
    }
}
