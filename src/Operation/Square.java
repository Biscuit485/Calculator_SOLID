package Operation;

public class Square implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * a;
    }
}
