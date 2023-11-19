package parameterized;

import exception.BadException;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import model.ValidateNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ������ c DataProvider ��� ������ ValidateNumber
 */
@Epic("Parameterized tests")
@Feature("ValidateNumberDataProvider")
public class ValidateNumberDataProvider {

    /**
     * �������� ���������� � ������� ValidateNumber
     */
    private ValidateNumber validateNumber;

    /**
     * ����� ������� ����������� ����� ������ ������, ������� ������ ������
     */
    @BeforeMethod
    public void setUp() {
        validateNumber = new ValidateNumber();
    }


    /**
     * DataProvider � ��������� ������� ��� ���������� ������
     *
     * @return ���������� ������ ��������� (����������� return ��� DataProvider)
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
     * DataProvider � ��������� ������� ��� ���������� ������
     *
     * @return ���������� ������ ��������� (����������� return ��� DataProvider)
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
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestPositiveNumberValidateNumber", description = "Parametrized positive tests")
    public void testPositiveNumberValidateNumber(String str, String expected) {
        assertEquals(validateNumber.validateNumber(str), expected);
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestNegativeNumberValidateNumber", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeNumberValidateNumber(String str) {
        validateNumber.validateNumber(str);
    }

}
