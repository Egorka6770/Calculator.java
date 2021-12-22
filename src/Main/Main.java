package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        String primer;
        System.out.println("Введите пример:");
        Scanner scanner = new Scanner(System.in);
        primer = scanner.nextLine();
        Calculator calc = new Calculator();
        x = calc.rechenie(primer);
        System.out.print(x);
    }
}