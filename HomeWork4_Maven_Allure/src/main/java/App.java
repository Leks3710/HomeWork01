import model.ValidateNumber;
import operation.Result;

import java.util.Scanner;

import static model.ValidateNumber.validateNumber;
import static model.ValidateString.validateString;

public class App {
    public static void main(String[] args) {


        Result result = new Result();
        // Бесконечный цикл
        while (true) {
            // Создание сканера, который работает с консоли
            Scanner scanner = new Scanner(System.in);
            // Ввод и проверка первой строки
            System.out.println("Введите первое число:");
            String one = validateNumber(scanner.nextLine());
            // Ввод и проверка знака операции
            System.out.println("Введите знак операции:");
            String operation = validateString(scanner.nextLine());
            // Ввод и проверка второй строки
            System.out.println("Введите второе число:");
            String two = validateNumber(scanner.nextLine());
            // Вывод результата с помощью метода result.Result, в котором числа и знак операции уже проверены
            System.out.println("Результат: " + result.Result(one, two, operation));

        }
    }
}
