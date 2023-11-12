package single;

import exception.BadException;
import io.qameta.allure.*;
import model.ValidateNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для ValidateNumber
 */
@Epic("Single tests")
@Feature("ValidateNumberTest")
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
    @Test(description = "Positive verification of a single number")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive verification of a single number")
    @Description("The test checks the singular number")
    public void testPutPositiveNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("10"), "10");
    }

    /**
     * Позитивная проверка отрацательного числа
     */
    @Test(description = "Positive check of the negative number")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive check of the negative number")
    @Description("The test checks for negative numbers")
    public void testPutNegativeNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("-99"), "-99");
    }

    /**
     * Позитивная проверка числа 0
     */
    @Test(description = "Positive verification of the number zero")
    @Severity(SeverityLevel.MINOR)
    @Story("Positive verification of the number zero")
    @Description("The test checks the number zero")
    public void testPutZeroValidateNumber() {
        assertEquals(validateNumber.validateNumber("0"), "0");
    }

    /**
     * Негативная проверка, если введены не цифры
     */
    @Test(expectedExceptions = BadException.class, description = "Negative character input check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative character input check")
    @Description("The test checks for negative character input")
    public void testNegativeSymbolsValidateNumber() {
        validateNumber.validateNumber("Hello&%");
    }

    /**
     * Негативная проверка, если пустая строка
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for empty string")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for empty string")
    @Description("The test checks for an empty string")
    public void testNegativeEmptyLineValidateNumber() {
        validateNumber.validateNumber("");
    }

    /**
     * Негативная проверка, если введены цифры и символы
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for input of characters and numbers")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for input of characters and numbers")
    @Description("Negative test for entering characters and numbers")
    public void testNegativeNumberValidateNumber() {
        validateNumber.validateNumber("5-5");
    }

    /**
     * Негативная проверка, если введен плюс и цифра
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for entering a plus and a digit")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for entering a plus and a digit")
    @Description("Negative plus and digit input test")
    public void testNegativeSymbolsStringValidateNumber() {
        validateNumber.validateNumber("+5");
    }
}
