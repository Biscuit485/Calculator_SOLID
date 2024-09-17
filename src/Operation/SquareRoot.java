package Operation;

public class SquareRoot implements Operation {
    @Override
    public double calculate(double a, double b) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Невозможно выполнить извлечение квадратного корня из отрицательного числа!");
        }
        return Math.sqrt(a);
    }
}
