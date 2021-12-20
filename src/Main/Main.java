package Main;

public class Main {

    public static void main(String[] args) {
        double x;
        String primer = "sqrt 2 ( 4 ^ 2 / 2 * 4 + 32 ) - 6";
        Calculator calc = new Calculator();
        x = calc.rechenie(primer);
        System.out.print(x);
    }
}