public class Agencia {
    private int numero;
    private String nome;

    public Agencia(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Numero da agencia: "+numero);
        System.out.println("Nome da Agencia: "+nome);
    }
}
