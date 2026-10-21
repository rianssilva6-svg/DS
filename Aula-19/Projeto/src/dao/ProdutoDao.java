package dao;

import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDao {
    
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listar() {
        return produtos;
    }

    public Produto buscar(int id) {
        for (Produto produto : produtos) {
            if(produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean alterar(int id, String nome, double preco, String categoria, int quantidade) {
        Produto produto = buscar(id);

        if(produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setCategoria(categoria);
            produto.setQuantidade(quantidade);
            return true;
        }
        return false;
    }

    public boolean remover(int id) {
        Produto produto = buscar(id);

        if(produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }



}
