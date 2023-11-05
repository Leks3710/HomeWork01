package parameterized;

import exception.BadException;
import model.ValidateNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор тестов c DataProvider для класса ValidateNumber
 */
public class ValidateNumberDataProvider {

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
     * DataProvider с тестовыми данными для позитивных тестов
     *
     * @return двухмерный массив объектвый (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestPositiveNumberValidateNumber() {
        return new String[][]{
                {"11", "11"},
                {"-101", "-101"},
                {"0", "0"},

        };
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов
     *
     * @return двухмерный массив объектвый (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestNegativeNumberValidateNumber() {
        return new String[][]{
                {"Hay"},
                {"5-"},
                {"+100"},
                {"9-9"},
                {""}
        };
    }

    /**
     * Параметризированный позитивный тест
     */
    @Test(dataProvider = "getTestPositiveNumberValidateNumber")
    public void testPositiveNumberValidateNumber(String str, String expected) {
        assertEquals(validateNumber.validateNumber(str), expected);
    }

    /**
     * Параметризированный негативный тест
     */
    @Test(dataProvider = "getTestNegativeNumberValidateNumber", expectedExceptions = BadException.class)
    public void testNegativeNumberValidateNumber(String str) {
        validateNumber.validateNumber(str);
    }

}
