import javax.swing.SwingUtilities;
import view.ClienteView;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClienteView tela = new ClienteView();
            tela.setVisible(true);
        });
    }
}