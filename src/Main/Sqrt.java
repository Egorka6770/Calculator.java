package Main;

public class Sqrt extends Operation {
    Sqrt(double x, double y) {
        Division division = new Division(1, y);
        result = Math.pow(x, division.getresult());
    }
}
