public class InputParser {
    public static String[] parseInput(String input) throws IllegalArgumentException {
        // Проверка и парсинг бинарных операций с возможными отрицательными числами
        if (input.matches("-?\\d+\\s*[+\\-*/]\\s*-?\\d+")) {
            return input.split("\\s*[+\\-*/]\\s*");
        }
        // Проверка и парсинг для извлечения квадратного корня (может быть отрицательное число)
        else if (input.matches("sqrt\\((-?\\d+)\\)")) {
            return new String[]{"sqrt", input.substring(5, input.length() - 1)};
        }
        // Проверка и парсинг для возведения в квадрат (может быть отрицательное число)
        else if (input.matches("sqr\\((-?\\d+)\\)")) {
            return new String[]{"sqr", input.substring(4, input.length() - 1)};
        }
        // Если не удалось распознать выражение, выбрасывается исключение
        else {
            throw new IllegalArgumentException("Ошибка ввода!");
        }
    }
}
