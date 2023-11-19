package parameterized;

import exception.BadException;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор тестов c DataProvider для класса Result
 */
@Epic("Parameterized tests")
@Feature("ResultTestDataProvider")
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
    public Object[][] getTestPositiveDataProvideResult() {
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
    public Object[][] getTestNegativeDataProvideResult() {
        return new Object[][]{
                {"100", "0", "/"},
        };
    }

    /**
     * Параметризированный позитивный тест
     */
    @Test(dataProvider = "getTestPositiveDataProvideResult", description = "Parametrized positive tests")
    public void testPositiveDataProvideResult(String one, String two, String operation, int expected) {
        assertEquals(result.Result(one, two, operation), expected);
    }

    /**
     * Параметризированный негативный тест
     */
    @Test(dataProvider = "getTestNegativeDataProvideResult", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeDataProvideResult(String one, String two, String operation) {
        result.Result(one, two, operation);
    }
}
