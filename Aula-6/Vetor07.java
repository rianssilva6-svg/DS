import java.util.Scanner;

public class Vetor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] nomes = new String[3];

            System.out.println("===== Cadastro de Nomes =====");

            for (int count = 0; count < nomes.length; count++) {
                System.out.print("Digite o "+(count+1)+"º nome: ");
                nomes[count] = sc.nextLine();
            }

            System.out.println("\n ===== Lista Atual =====");
            listar(nomes);

            System.out.print("\nDigite a posição para alterar: ");
            int posAlterar = sc.nextInt();
            sc.nextLine();

            if (posAlterar>=0 && posAlterar<nomes.length) {
                System.out.print("Digite um novo nome: ");
                nomes[posAlterar] = sc.nextLine();
            }
            else {
                System.out.print("Posição inválida");
            }

            System.out.println("\n ===== Lista atualizada =====");
            listar(nomes);

            System.out.print("\n Digite a posição para remover: ");
            int posRemover = sc.nextInt();

            if (posRemover >= 0 && posRemover<nomes.length) {
                for(int count = posRemover; count<nomes.length-1;count++) {
                    nomes[count] = nomes[count+1];
                }
                nomes[nomes.length - 1] = null;
            }
            else {
                System.out.println("Posição inválida");
            }
            System.out.println("\n ===== Lista Atualizada Após Remoção =====");
            listar(nomes);

        sc.close();
    }

    public static void listar(String[] array) {
        for (int count = 0;count < array.length;count++) {
            System.out.println((count+1)+" - "+array[count]);
        }
    }
}
