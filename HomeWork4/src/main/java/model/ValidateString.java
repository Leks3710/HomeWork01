package model;

import exception.BadException;

/**
 * Класс для проверки на валидацию знака операции
 */
public class ValidateString {
    /**
     * Проверка знака операции на соответствие необходимым символом
     *
     * @param input - Метод для проверки строки на допустимые символы
     */
    public static String validateString(String input) {
        if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
            return input;
        } else {
            throw new BadException("Неправильный символ " + input);
        }
    }
}

