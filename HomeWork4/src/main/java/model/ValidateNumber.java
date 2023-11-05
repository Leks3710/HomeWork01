package model;

import exception.BadException;

/**
 * Класс для проверки на валидацию цифр
 */
public class ValidateNumber {
    /**
     * Проверка на количество символов, минуса, цифр и отстутвие пустой строки
     *
     * @param numberOneAndTwo - Метод для проверки строки на допустимые числа
     */
    public static String validateNumber(String numberOneAndTwo) {
        if (numberOneAndTwo.length() <= 10 && numberOneAndTwo.matches("-?\\d+") && !numberOneAndTwo.isEmpty()) {
            return numberOneAndTwo;
        } else {
            throw new BadException("Неправильный символ: " + numberOneAndTwo);
        }
    }

}


