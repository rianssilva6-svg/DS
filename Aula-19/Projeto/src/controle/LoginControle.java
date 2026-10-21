package controle;

import dao.UsuarioDao;

public class LoginControle {
    private UsuarioDao usuariodao = new UsuarioDao();

    public boolean logar(String login, String senha) {
        return usuariodao.autenticar(login, senha) != null;
    }
}
