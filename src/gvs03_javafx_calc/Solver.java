package gvs03_javafx_calc;

public class Solver {

    public static double solve(double x, double a, double b, double c) {
        double y;

        if (x < 4) {
            y = ((((x * x) + (a * a)) * c) / (2 * b));
        } else {
            y = ((x * x * x) * (a - b));
        }

        return y;
    }
}
