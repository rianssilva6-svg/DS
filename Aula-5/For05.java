import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            for(int count = 1;count <=3;count++) {
            
                System.out.println("Informe o nome: "+count);
                String nome = sc.nextLine();
                System.out.println("O nome cadastrado é: "+nome);
            
            }

        sc.close();
    }
}
