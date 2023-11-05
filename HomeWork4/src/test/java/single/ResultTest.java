package single;

import exception.BadException;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор отдельных тестов для Result
 */
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
    @Test
    public void testPlusResult() {
        assertEquals(result.Result("10", "5", "+"), 15);
    }

    /**
     * Позитивная проверка вычитания
     */
    @Test
    public void testMultiplicationResult() {
        assertEquals(result.Result("500", "1000", "-"), -500);
    }

    /**
     * Позитивная проверка умножения двух отрицательных цифр
     */
    @Test
    public void testMultiplicationMinusResult() {
        assertEquals(result.Result("-100", "-5", "*"), 500);
    }


    /**
     * Негативная проверка при делении на ноль
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeDivideToZeroResult() {
        result.Result("-5", "0", "/");
    }

}




