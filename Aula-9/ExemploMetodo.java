public class ExemploMetodo {
    
    // Sem parâmetro e sem retorno
    public static void mensagem() {
        System.out.println("Seja bem vindo");
    }

    // Com parametro e sem retorno
    public static void mostrarNome(String nome) {
        System.out.println("Nome: "+nome);
    }

    // Sem parametro e com retorno
    public static int obterNumero() {
        return 10;
    }

    //Com parametro e com retorno
    public static int somar(int n1, int n2) {
        return  n1+n2;
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        mensagem();
        mostrarNome("Rian");

        int numero = obterNumero();
        System.out.println("Numero: "+numero);

        int resultado = somar(10, 5);
        System.out.println("Soma: "+resultado);
    }
}
