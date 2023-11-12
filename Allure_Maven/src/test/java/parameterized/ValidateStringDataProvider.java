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
 * ����� ������ c DataProvider ��� ������ ValidateString
 */
@Epic("Parameterized tests")
@Feature("ValidateStringDataProvider")
public class ValidateStringDataProvider {
    /**
     * �������� ���������� � ������� ValidateString
     */
    private ValidateString validateString;

    /**
     * ����� ������� ����������� ����� ������ ������, ������� ������ ������
     */
    @BeforeMethod
    public void setUp() {
        validateString = new ValidateString();
    }


    /**
     * DataProvider � ��������� ������� ��� ���������� ������
     *
     * @return ���������� ������ ��������� (����������� return ��� DataProvider)
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
     * DataProvider � ��������� ������� ��� ���������� ������
     *
     * @return ���������� ������ ��������� (����������� return ��� DataProvider)
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
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestPositiveStringValidateString", description = "Parametrized positive tests")
    public void testPositiveStringValidateString(String str, String expected) {
        assertEquals(validateString.validateString(str), expected);
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestNegativeStringValidateString", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeStringValidateString(String str) {
        validateString.validateString(str);
    }

}
