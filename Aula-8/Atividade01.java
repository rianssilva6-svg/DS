import java.util.Scanner;

public class Atividade01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int [] numeros = new int[5];
            int escolha = 1;

            int quantCadastro = 0;

            while (escolha!=4) {
                System.out.println("===== Menu =====");
                System.out.println("1 - Inserir números\n2 - Listar números\n3 - Remover Número\n4 - Sair");
                System.out.print("Escolha: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        if (quantCadastro<numeros.length) {
                            System.out.println("===== Inserir Número =====");
                            for(int contador = 0; contador < numeros.length; contador++) {
                                System.out.print("Digite o "+(contador+1)+"º número: ");
                                numeros[contador] = sc.nextInt();
                                quantCadastro++;
                            }
                            System.out.println("Cadastro de números realizados");
                        }
                        else {
                            System.out.println("Array Cheio...");
                        }
                        break;

                    case 2:
                        if (quantCadastro == 0) {
                            System.out.println("Não há números cadastrados");
                        }
                        else {
                            System.out.println("===== Listar Números =====");
                            for(int lista = 0; lista < numeros.length; lista++) {
                                System.out.println("Índice: "+lista+" | "+"Número: "+numeros[lista]);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("===== Remover Número =====");
                        if (quantCadastro == 0) {
                            System.out.println("Não há números para remover");
                        }
                        else {
                            System.out.print("Digite a posição para remover: ");
                            int posRemover = sc.nextInt();

                            if (posRemover >= 0 && posRemover<numeros.length) {
                                for(int count = posRemover; count < numeros.length-1 ; count++) {
                                    numeros[count] = numeros[count+1];
                                }
                                numeros[numeros.length - 1] = 0;
                                quantCadastro--;
                                System.out.println("Número removido");
                            }
                            else {
                                System.out.println("Indice inválido");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Finalizando o sistema....");
                        break;

                    default:
                        System.out.println("Valor inválido, tente novamente...");
                        break;
                }
            }


        sc.close();
    }
}
