package service;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class IntegralSolver {
    private final double a, b, D;
    private final String function;

    public IntegralSolver(double a, double b, double D, String function) {
        this.a = a;
        this.b = b;
        this.D = D;
        this.function = function;
    }

    public double calculateResult() {
        double result = 0;
        double x = a + (D / 2);

        if(a > b)
        {
            while (x > b) {
                Expression expression = new Expression(function, new Argument("x = " + x));
                result -= D * expression.calculate();
                x -= D;
            }
        }

        else {
            while (x < b) {
                Expression expression = new Expression(function, new Argument("x = " + x));
                result += D * expression.calculate();
                x += D;
            }
        }

        return result;
    }
}
