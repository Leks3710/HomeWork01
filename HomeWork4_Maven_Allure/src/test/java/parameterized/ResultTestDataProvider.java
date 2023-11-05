package parameterized;

import exception.BadException;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор тестов c DataProvider для класса Result
 */
public class ResultTestDataProvider {

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
     * DataProvider с тестовыми данными для позитивных тестов
     *
     * @return двухмерный массив объектвый (return Object для DataProvider)
     */
    @DataProvider
    public Object[][] getTestPositiveResult() {
        return new Object[][]{
                {"10", "5", "-", 5},
                {"-500", "500", "+", 0},
                {"-5000", "5", "/", -1000},
        };
    }

    /**
     * DataProvider с тестовыми данными для негативного теста
     *
     * @return двухмерный массив объектвый (return Object для DataProvider)
     */
    @DataProvider
    public Object[][] getTestNegativeResult() {
        return new Object[][]{
                {"100", "0", "/"},
        };
    }

    /**
     * Параметризированный позитивный тест
     */
    @Test(dataProvider = "getTestPositiveResult")
    public void testPositiveResult(String one, String two, String operation, int expected) {
        assertEquals(result.Result(one, two, operation), expected);
    }

    /**
     * Параметризированный негативный тест
     */
    @Test(dataProvider = "getTestNegativeResult", expectedExceptions = BadException.class)
    public void testNegativeResult(String one, String two, String operation) {
        result.Result(one, two, operation);
    }
}
