public class Contato{

    private  String nome;
    private  String numero;

    public Contato(String CTnome, String CTnumero) {
        this.nome = CTnome;
        this.numero = CTnumero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String CTnome) {
        this.nome = CTnome;
    }


    public String getNumero() {
        return numero;
    }
    public void setNumero(String CTnumero) {
        this.numero = CTnumero;
    }

    public String toString () {
        return nome+" - "+numero;
    }
}
