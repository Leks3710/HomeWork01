package single;

import exception.BadException;
import io.qameta.allure.*;
import model.ValidateString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для ValidateString
 */
@Epic("Single tests")
@Feature("ValidateStringTest")
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
    @Test(description = "Positive multiplication check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive multiplication check")
    @Description("Positive multiplication test")
    public void testMultiplicationValidateString() {
        assertEquals(validateString.validateString("*"), "*");
    }

    /**
     * Позитивная проверка сложения
     */
    @Test(description = "Positive addition check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive addition check")
    @Description("Positive addition test")
    public void testPlusValidateString() {
        assertEquals(validateString.validateString("+"), "+");
    }

    /**
     * Позитивная проверка вычитания
     */
    @Test(description = "Positive subtraction check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive subtraction check")
    @Description("Positive subtraction test")
    public void testMinusValidateString() {
        assertEquals(validateString.validateString("-"), "-");
    }

    /**
     * Позитивная проверка деления
     */
    @Test(description = "Positive division check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive division check")
    @Description("Positive division test")
    public void testDivideValidateString() {
        assertEquals(validateString.validateString("/"), "/");
    }

    /**
     * Негативная проверка, если пустая строка
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for empty string")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for empty string")
    @Description("The test checks for an empty string")
    public void testNegativeEmptyLineValidateString() {
        validateString.validateString("");
    }

    /**
     * Негативная проверка, если введены не соответствующие символы
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for inappropriate characters")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for inappropriate characters")
    @Description("Negative test for inappropriate characters")
    public void testNegativeStringValidateString() {
        validateString.validateString("Hello");
    }

    /**
     * Негативная проверка, если введены цифры и знак операции
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for input of characters and numbers")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for input of characters and numbers")
    @Description("Negative test for entering characters and numbers")
    public void testNegativeNumberAndStringValidateString() {
        validateString.validateString("/57");
    }
}
