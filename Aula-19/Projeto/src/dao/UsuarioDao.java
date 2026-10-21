package dao;
import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioDao {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("admin", "123456"));
    }

    public Usuario autenticar(String login, String senha) {
        
        for (Usuario usuario : usuarios) {
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}
