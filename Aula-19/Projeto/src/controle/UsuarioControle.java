package controle;

import dao.UsuarioDao;

public class UsuarioControle {
    private UsuarioDao usuariodao = new UsuarioDao();

    public boolean logar(String login, String senha) {
        return usuariodao.autenticar(login, senha) != null;
    }
}
