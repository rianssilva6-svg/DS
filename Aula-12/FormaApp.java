public class FormaApp {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("Área do Circulo: "+circulo.CalcularArea());

        System.out.println("Área do Retangulo: "+retangulo.CalcularArea());
    }
}
