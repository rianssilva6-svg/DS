public class Loja {
    private String nome;
    private float preco;
    private int quantidade;

    public Loja (String CTnome, float CTpreco, int CTquantidade) {
        this.nome = CTnome;
        this.preco = CTpreco;
        this.quantidade = CTquantidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String CTnome) {
        this.nome = CTnome;
    }



    public float getPreco() {
        return preco;
    }
    public void setPreco(float CTpreco) {
        this.preco = CTpreco;
    }



    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int CTquantidade) {
        this.quantidade = CTquantidade;
    }



    
}
