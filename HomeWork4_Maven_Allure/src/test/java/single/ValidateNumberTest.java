package single;

import exception.BadException;
import model.ValidateNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для ValidateNumber
 */
public class ValidateNumberTest {

    /**
     * Создание переменной с классом ValidateNumber
     */
    private ValidateNumber validateNumber;

    /**
     * Метод который выполняется перед каждым тестом, создает объект класса
     */
    @BeforeMethod
    public void setUp() {
        validateNumber = new ValidateNumber();
    }

    /**
     * Позитивная проверка одного числа
     */
    @Test
    public void testPutPositiveNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("10"), "10");
    }

    /**
     * Позитивная проверка отрацательного числа
     */
    @Test
    public void testPutNegativeNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("-99"), "-99");
    }

    /**
     * Позитивная проверка числа 0
     */
    @Test
    public void testPutZeroValidateNumber() {
        assertEquals(validateNumber.validateNumber("0"), "0");
    }

    /**
     * Негативная проверка, если введены не цифры
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeSymbolsValidateNumber() {
        validateNumber.validateNumber("Hello&%");
    }

    /**
     * Негативная проверка, если пустая строка
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeEmptyLineValidateNumber() {
        validateNumber.validateNumber("");
    }

    /**
     * Негативная проверка, если введены цифры и символы
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeNumberValidateNumber() {
        validateNumber.validateNumber("5-5");
    }

    /**
     * Негативная проверка, если введен плюс и цифра
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeSymbolsStringValidateNumber() {
        validateNumber.validateNumber("+5");
    }
}
