public class Vetor05 {
    public static void main(String[] args) {
        System.out.println("===== Boletim =====");
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana"};
        double[] notas = {8.5,7.0,9.2,6.8};

        for (int count = 0; count < 4; count++) {
            System.out.println("Aluno: "+alunos[count]+" - Nota: "+notas[count]);
        }
    }
}
