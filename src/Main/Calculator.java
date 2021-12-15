package Main;

import java.util.*;

public class Calculator {
    private String str = "";
    private int x, y, x2;

    double rechenie(String ur) {
        str = "";
        List<String> elem = new ArrayList<String>();
        for (String listElement : ur.split(" ")) {
            elem.add(listElement);
        }


        while (elem.indexOf("(") != -1) {

            for (x = elem.size() - 1; x >= 0; x--) {
                if (elem.get(x).equals("(")) {
                    for (y = x; y < elem.size(); y++) {
                        if (elem.get(y).equals(")")) {
                            for (int i = x + 1; i <= y - 1; i++) {
                                str += elem.get(x + 1);
                                str += " ";
                                elem.remove(x);

                                x2 = x;
                            }
                            elem.remove(x);
                            elem.remove(x);
                            elem.add(x2, String.valueOf(operacion(str)));
                            str = "";

                        }
                    }
                }
            }
        }

        if (elem.size() != 1) {
            str = "";
            for (int i = 0; i < elem.size(); i++) {
                str += elem.get(i);
                str += " ";
            }
            elem.add(0, operacion(str));
        }

        return Double.valueOf(elem.get(0));
    }

    private String operacion(String str) {
        List<String> elem2 = new ArrayList<String>();
        for (String listElement : str.split(" ")) {
            elem2.add(listElement);
        }
        while (elem2.indexOf("^") != -1) {
            for (int z = elem2.size() - 1; z >= 0; z--) {
                if (elem2.get(z).equals("^")) {
                    double sum = Math.pow(Double.valueOf(elem2.get(z - 1)), Double.valueOf(elem2.get(z + 1)));
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.add(z - 1, String.valueOf(sum));

                }
            }
        }
        while (elem2.indexOf("sqrt") != -1) {
            for (int z = elem2.size() - 1; z >= 0; z--) {
                if (elem2.get(z).equals("sqrt")) {
                    double sum = Math.sqrt(Double.valueOf(elem2.get(z + 1)));
                    elem2.remove(z);
                    elem2.remove(z);
                    elem2.add(z, String.valueOf(sum));

                }
            }
        }
        while (elem2.indexOf("/") != -1) {
            for (int z = 0; z <= elem2.size() - 1; z++) {
                if (elem2.get(z).equals("/")) {
                    Division sum = new Division(Double.valueOf(elem2.get(z - 1)), Double.valueOf(elem2.get(z + 1)));
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.add(z - 1, String.valueOf(sum.getresult()));

                }
            }
        }
        while (elem2.indexOf("*") != -1) {
            for (int z = 0; z <= elem2.size() - 1; z++) {
                if (elem2.get(z).equals("*")) {
                    Multiplication sum = new Multiplication(Double.valueOf(elem2.get(z - 1)), Double.valueOf(elem2.get(z + 1)));
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.add(z - 1, String.valueOf(sum.getresult()));

                }
            }
        }
        while (elem2.indexOf("+") != -1) {
            for (int z = 0; z <= elem2.size() - 1; z++) {
                if (elem2.get(z).equals("+")) {
                    Addition sum = new Addition(Double.valueOf(elem2.get(z - 1)), Double.valueOf(elem2.get(z + 1)));
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.add(z - 1, String.valueOf(sum.getresult()));

                }
            }
        }
        while (elem2.indexOf("-") != -1) {
            for (int z = 0; z <= elem2.size() - 1; z++) {
                if (elem2.get(z).equals("-")) {
                    double sum = Double.valueOf(elem2.get(z - 1)) - Double.valueOf(elem2.get(z + 1));
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.remove(z - 1);
                    elem2.add(z - 1, String.valueOf(sum));
                }
            }
        }
        return elem2.get(0);
    }

}
