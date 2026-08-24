import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        


            for(int count = 1;count <=3;count++) {
                System.out.print("Informe o "+count+"º número: ");
                int numero = sc.nextInt();
                System.out.println("O número informado é: "+numero);
                
            }


        sc.close();


    }
}
