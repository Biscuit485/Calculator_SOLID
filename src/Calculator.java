import java.util.HashMap;
import java.util.Map;
import Operation.*;

public class Calculator {
    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
        operations.put("sqrt", new SquareRoot());
        operations.put("sqr", new Square());
    }

    public double performOperation(String operation, double a, double b) throws ArithmeticException {
        Operation op = operations.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Неподдерживаемая операция!");
        }
        return op.calculate(a, b);
    }
}
