package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        double x;
        String primer;
        System.out.println("Введите пример:");
        Scanner scanner = new Scanner(System.in);
        primer = scanner.nextLine();
        Calculator calc = new Calculator();
        x = calc.rechenie(primer);
        System.out.print("Ответ: ");
        System.out.print(x);
        scanner.nextLine();
        Thread.sleep(2000);
    }
}