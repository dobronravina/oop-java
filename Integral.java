package module;

public class Integral {
    private final double a, b, D, result;
    private final String functionAsString;

    public Integral(double a, double b, double D, String functionAsString, double result) {
        this.a = a;
        this.b = b;
        this.D = D;
        this.functionAsString = functionAsString;
        this.result = result;
    }

    @Override
    public String toString() {
        String format = "{a=%s, b=%s, D=%s, function=%s, result=%s}";
        return String.format(format, a, b, D, functionAsString, result);
    }
}
