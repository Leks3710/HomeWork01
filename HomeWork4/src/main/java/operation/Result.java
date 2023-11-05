package operation;

import exception.BadException;

/**
 * Класс для проверки оперции калькулятора
 */
public class Result {

    /**
     * Три значения и их геттеры с помощью которых метод Result будет производить операции
     */
    private String One;
    private String Two;
    private String Operation;


    public String getOne() {
        return One;
    }

    public String getTwo() {
        return Two;
    }

    public String getOperation() {
        return Operation;
    }


    public int Result(String One, String Two, String Operation) {
        // Принимаем две строки в качестве аргумента и возвращаем целые числа
        int oneInt = Integer.parseInt(One.trim());
        int twoInt = Integer.parseInt(Two.trim());
        // Операции калькулятора
        if (Operation.equals("+")) {
            return oneInt + twoInt;
        } else if (Operation.equals("-")) {
            return oneInt - twoInt;
        } else if (Operation.equals("*")) {
            return oneInt * twoInt;
        } else if (Operation.equals("/")) {
            if (oneInt != 0 && twoInt != 0) {
                return oneInt / twoInt;
            } else {
                throw new BadException("Нельзя делить на 0");
            }

        }
        return 0;
    }
}
