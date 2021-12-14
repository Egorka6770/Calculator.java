package Main;

public class Split extends Operation {
    Split(double a, double b) {
        super(a, b);
        try {
            if (b == 0.0) {
                throw new ArithmeticException("Деление на 0");
            } else {
                sum = a / b;
            }

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

}
