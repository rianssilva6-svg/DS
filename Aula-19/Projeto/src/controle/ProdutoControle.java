package controle;

import dao.ProdutoDao;
import java.util.ArrayList;
import modelo.Produto;

public class ProdutoControle {
    private ProdutoDao dao;

    public ProdutoControle() {
        dao = new ProdutoDao();
    }

    public void cadastrar(int id, String nome, double preco, String categoria, int quantidade) {
        Produto produto = new Produto(id, nome, preco, categoria, quantidade);
        dao.cadastrar(produto);
    }

    public ArrayList <Produto> listar(){
        return dao.listar();
    }

    public Produto buscar(int id){
        return dao.buscar(id);
    }

    public boolean alterar(int id, String nome, double preco, String categoria, int quantidade) {
        return dao.alterar(id, nome, preco, categoria, quantidade);
    }

    public boolean remover(int id) {
        return dao.remover(id);
    }
}
