public class CalcApp {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(10, 5));
        System.out.println(calc.somar(5, 6, 7));
        System.out.println(calc.somar(10.5, 6.8));
    }
}
