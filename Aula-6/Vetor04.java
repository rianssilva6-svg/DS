import java.util.Scanner;

public class Vetor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] nomes = new String[3];

            for (int count = 0;count<nomes.length;count++) {
                System.out.print("Informe o "+(count+1)+"° nome: ");
                nomes[count]=sc.nextLine();
            }
            
            System.out.println("\n");
            System.out.println("===== Nomes cadastrados =====");

            for (String nome : nomes) {
                System.out.println(nome);
            }

        sc.close();
    }
}
