package Main;

public class Sqrt extends Operation {
    Sqrt(double a, double b) {
        Division division = new Division(1.0, b);
        try {
            if (b % 2 == 0.0 && a < 0.0) {
                throw new ArithmeticException("Отрицательное подкоренное выражение");
            } //else {
                setresult(Math.pow(a, 1. / b));
            //}
        } catch (ArithmeticException e) {
            System.err.print(e.getMessage());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }
}
