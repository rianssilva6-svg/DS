import java.util.Scanner;

public class Vetor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] nomes;
            int[] idades;

            System.out.print("Quantas pessoas deseja cadastrar: ");
            int quantidade = sc.nextInt();

            nomes=new String[quantidade];
            idades=new int[quantidade];

            for (int count = 0;count < quantidade; count++) {
                System.out.print("Digite o "+(count+1)+"º nome: ");
                nomes[count] = sc.next();

                System.out.print("Digite a idade: ");
                idades[count] = sc.nextInt();
                sc.nextLine();
            }


            System.out.println("\n ===== Registro =====");
            for (int count = 0; count < quantidade; count++) {
                System.out.println(nomes[count]+" - "+idades[count]+" anos");
            }

        sc.close();
    }
}
