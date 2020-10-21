package gvs03_javafx_calc;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolverTest {

    @Test
    public void testSolveLessThanFour() {
        // (x^2 + a^2) * c
        // ---------------
        //      2 * b

        // (1^2 + 3^2) * 1
        // --------------- = 5
        //      2 * 1
        double x = 1.0;
        double a = 3.0;
        double b = 1.0;
        double c = 1.0;
        double expResult = 5.0;
        double result = Solver.solve(x, a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolveGreaterThanOrEqualFour() {
        // x^3 * (a - b)

        // 5^3 * (2 - 1) = 125
        double x = 5.0;
        double a = 2.0;
        double b = 1.0;
        double c = 0.0;
        double expResult = 125.0;
        double result = Solver.solve(x, a, b, c);
        assertEquals(expResult, result);
    }

}
