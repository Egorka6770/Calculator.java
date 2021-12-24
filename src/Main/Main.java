package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        String primer, answer;
        boolean c = true;
        Scanner scanner = new Scanner(System.in);
        while (c) {
            System.out.println("Введите пример:");

            primer = scanner.nextLine();
            Calculator calc = new Calculator();
            x = calc.rechenie(primer);
            System.out.print("Ответ: ");
            System.out.println(x);
            System.out.println("Желаете продолжить? ");
            answer = scanner.nextLine();
            if (!answer.equals("Да")) {
                c = false;
            }
        }

    }
}