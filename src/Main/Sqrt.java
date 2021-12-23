package Main;

public class Sqrt extends Operation {
    Sqrt(double x, double y) {
        Division division = new Division(1, y);
        setresult(Math.pow(x, division.getresult()));
    }
}
