package parameterized;

import exception.BadException;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import model.ValidateString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Набор тестов c DataProvider для класса ValidateString
 */
@Epic("Parameterized tests")
@Feature("ValidateStringDataProvider")
public class ValidateStringDataProvider {
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
     * DataProvider с тестовыми данными для позитивных тестов
     *
     * @return двухмерный массив объектвый (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestPositiveStringValidateString() {
        return new String[][]{
                {"+", "+"},
                {"-", "-"},
                {"*", "*"},
                {"/", "/"}
        };
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов
     *
     * @return двухмерный массив объектвый (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestNegativeStringValidateString() {
        return new String[][]{
                {"Hay"},
                {"+100"},
                {"/57"},
                {""}
        };
    }

    /**
     * Параметризированный позитивный тест
     */
    @Test(dataProvider = "getTestPositiveStringValidateString", description = "Parametrized positive tests")
    public void testPositiveStringValidateString(String str, String expected) {
        assertEquals(validateString.validateString(str), expected);
    }

    /**
     * Параметризированный негативный тест
     */
    @Test(dataProvider = "getTestNegativeStringValidateString", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeStringValidateString(String str) {
        validateString.validateString(str);
    }

}
