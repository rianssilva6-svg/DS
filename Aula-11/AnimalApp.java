package Atividade_animal;

import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {

        String nome;
        int idade;
        String raca;
        String cor;

        Cachorro animal1 = new Cachorro(null, 0, null);
        Gato animal2 = new Gato(null, 0, null);

        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);

            int op;
            do{
                System.out.println("===== Clinica Veterinaria =====");
                System.out.println("1 - Cadastrar Cachorro");
                System.out.println("2 - Cadastrar Gato");
                System.out.println("3 - Exibir Cachorro");
                System.out.println("4 - Exibir Gato");
                System.out.println("5 - Fazer Cachorro emitir som");
                System.out.println("6 - Fazer Gato emitir som");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Valor invalida!! Digite apenas numeros");
                    sc.next();
                }

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Digite o nome do animal: ");
                        nome = sc.next();

                        System.out.print("Digite a idade: ");
                        idade = sc.nextInt();

                        System.out.print("Digite a raca: ");
                        raca = sc.next();

                        animal1.setNome(nome);
                        animal1.setIdade(idade);
                        animal1.setRaca(raca);
                        break;


                    case 2:
                        System.out.print("Digite o nome do animal: ");
                        nome = sc.next();

                        System.out.print("Digite a idade: ");
                        idade = sc.nextInt();

                        System.out.print("Digite a cor: ");
                        cor = sc.next();

                        animal2.setNome(nome);
                        animal2.setIdade(idade);
                        animal2.setCor(cor);
                        break;

                    case 3:
                        System.out.println("===== Exibir Animal =====");
                        animal1.exibirInfo();
                        System.out.println("\n");
                        break;

                    case 4:
                        System.out.println("===== Exibir Animal =====");
                        animal2.exibirInfo();
                        System.out.println("\n");
                        break;

                    case 5:
                        System.out.println("===== Som do Animal =====");
                        animal1.emitirSom();
                        System.out.println("\n");
                        break;

                    case 6:
                        System.out.println("===== som do Animal =====");
                        animal2.emitirSom();
                        System.out.println("\n");
                        break;

                    case 0:
                        System.out.println("Sistema Finalizado...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }

            }while(op!=0);

        sc.close();
    }
}
