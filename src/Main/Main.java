package Main;

public class Main {

    public static void main(String[] args) {
        double x;
        String primer = "2 + 3 * 6 ^ 4";
        Calculator calc = new Calculator();
        x = calc.rechenie(primer);
        System.out.print(x);
    }
}