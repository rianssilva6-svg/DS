package atividade;

public class Atividade04 {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count ++) {
            System.out.println("Tabuada do "+count+ ": ");
                for (int tabu = 1; tabu <= 10; tabu ++) {
                    int resultado=count*tabu;
                    System.out.println(count+" x "+tabu+" = "+resultado);
                }
                System.out.println();

        }

        
        
    }
}
