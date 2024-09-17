import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите выражение (например, 1 + 1 или sqrt(4)):");

            String input = scanner.nextLine();
            try {
                String[] parsedInput = InputParser.parseInput(input);
                double result;

                if (parsedInput.length == 2 && (parsedInput[0].equals("sqrt") || parsedInput[0].equals("sqr"))) {
                    result = calculator.performOperation(parsedInput[0], Double.parseDouble(parsedInput[1]), 0);
                } else {
                    double a = Double.parseDouble(parsedInput[0]);
                    double b = Double.parseDouble(parsedInput[1]);
                    String operation = input.replaceAll("\\d+", "").trim();
                    result = calculator.performOperation(operation, a, b);
                }

                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Сообщение: \"" + e.getMessage() + "\"");
            } catch (IllegalArgumentException e) {
                System.out.println("Сообщение: \"" + e.getMessage() + "\"");
            } catch (Exception e) {
                System.out.println("Произошла ошибка!");
            }
        }
    }
}
