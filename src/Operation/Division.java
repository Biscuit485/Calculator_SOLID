package Operation;

public class Division implements Operation {
    @Override
    public double calculate(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Невозможно выполнить деление на ноль!");
        }
        return a / b;
    }
}
