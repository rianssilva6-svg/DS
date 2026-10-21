
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.LoginView;

public class App {
    
    public static void main(String[] args) {
        
        // Configura o visual da aplicação para o padrão do sistema operacional (Opcional, deixa mais bonito)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Inicia a aplicação na Thread correta do Swing
        SwingUtilities.invokeLater(() -> {
            // Chama a tela de login como primeira tela
            LoginView telaLogin = new LoginView();
            telaLogin.setVisible(true);
        });
    }
}