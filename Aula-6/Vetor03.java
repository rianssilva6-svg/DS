public class Vetor03 {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,40,50};
    
        for (int count = 0; count < numeros.length; count++) {
            System.out.println("Posição: "+count+" = "+numeros[count]);
        }
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
