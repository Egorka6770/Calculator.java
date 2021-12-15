package Main;

public class Main {

    public static void main(String[] args) {

        double x;
        String primer = "16 / ( 0 + 0 ) ";
        Calculator calc = new Calculator();
        x = calc.rechenie(primer);
        System.out.println(x);

    }
}