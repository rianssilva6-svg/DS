package atividade;

public class Atividade03 {
    public static void main(String[] args) {
        for(int count = 1;count <=51;count++) {
            
            if (count % 2 !=0) {
                System.out.println("Os números impares: "+count);
            }
            
        }
        for (int count = 51; count <= 100; count++) {
            if (count % 2 == 0) {
                System.out.println("Os números pares: "+count);
            }
        }
    }
}
