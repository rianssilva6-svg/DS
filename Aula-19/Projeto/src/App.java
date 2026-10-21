
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.LoginView;

public class App {
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            LoginView telaLogin = new LoginView();
            telaLogin.setVisible(true);
        });
    }
}