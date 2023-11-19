package single;

import exception.BadException;
import io.qameta.allure.*;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для Result
 */
@Epic("Single tests")
@Feature("ResultTest")
public class ResultTest {

    /**
     * Создание переменной с классом Result
     */
    private Result result;

    /**
     * Метод который выполняется перед каждым тестом, создает объект класса
     */
    @BeforeMethod
    public void setUp() {
        result = new Result();
    }

    /**
     * Позитивная проверка сложения
     */
    @Test(description = "Positive addition test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive addition test")
    @Description("The test checks for addition")
    public void testPlusResult() {
        assertEquals(result.Result("10", "5", "+"), 15);
    }

    /**
     * Позитивная проверка вычитания
     */
    @Test(description = "Positive subtraction test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive subtraction test")
    @Description("The test checks for subtraction")
    public void testMultiplicationResult() {
        assertEquals(result.Result("500", "1000", "-"), -500);
    }

    /**
     * Позитивная проверка умножения двух отрицательных цифр
     */
    @Test(description = "Positive verification of multiplication of two negative digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive verification of multiplication of two negative digits")
    @Description("The test checks the multiplications of two negative digits")
    public void testMultiplicationMinusResult() {
        assertEquals(result.Result("-100", "-5", "*"), 500);
    }


    /**
     * Негативная проверка при делении на ноль
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check when dividing by zero")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Negative check when dividing by zero")
    @Description("The test checks for division by zero")
    public void testNegativeDivideToZeroResult() {
        result.Result("-5", "0", "/");
    }

}




