package single;

import exception.BadException;
import model.ValidateString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для ValidateString
 */
public class ValidateStringTest {

    /**
     * Создание переменной с классом ValidateString
     */
    private ValidateString validateString;

    /**
     * Метод который выполняется перед каждым тестом, создает объект класса
     */
    @BeforeMethod
    public void setUp() {
        validateString = new ValidateString();
    }

    /**
     * Позитивная проверка умножения
     */
    @Test
    public void testMultiplicationValidateString() {
        assertEquals(validateString.validateString("*"), "*");
    }

    /**
     * Позитивная проверка сложения
     */
    @Test
    public void testPlusValidateString() {
        assertEquals(validateString.validateString("+"), "+");
    }

    /**
     * Позитивная проверка вычитания
     */
    @Test
    public void testMinusValidateString() {
        assertEquals(validateString.validateString("-"), "-");
    }

    /**
     * Позитивная проверка деления
     */
    @Test
    public void testDivideValidateString() {
        assertEquals(validateString.validateString("/"), "/");
    }

    /**
     * Негативная проверка, если пустая строка
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeEmptyLineValidateString() {
        validateString.validateString("");
    }

    /**
     * Негативная проверка, если введены не соответствующие символы
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeStringValidateString() {
        validateString.validateString("Hello");
    }

    /**
     * Негативная проверка, если введены цифры и знак операции
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeNumberAndStringValidateString() {
        validateString.validateString("/57");
    }
}
