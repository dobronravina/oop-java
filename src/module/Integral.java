package module;

public class Integral {
    private final double a, b, D, result;
    private final String function;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getD() {
        return D;
    }

    public double getResult() {
        return result;
    }

    public String getFunction() {
        return function;
    }

    public Integral(double a, double b, double D, String functionAsString, double result) {
        this.a = a;
        this.b = b;
        this.D = D;
        this.function = functionAsString;
        this.result = result;
    }

}

