package Main;

public class Division extends Operation {
    Division(double a, double b) {
        try {
            if (b == 0.0) {
                throw new ArithmeticException("Деление на 0");
            } else {
                setresult(a / b);
            }
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
