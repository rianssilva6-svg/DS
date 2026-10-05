import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dado.txt");

            fw.write("Primeira linha\n");
            fw.write("Segunda linha\n");

            fw.close();
            System.out.println("Escrita Concluida");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
