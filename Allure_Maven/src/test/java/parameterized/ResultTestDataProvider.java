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
 * ����� ������ c DataProvider ��� ������ Result
 */
@Epic("Parameterized tests")
@Feature("ResultTestDataProvider")
public class ResultTestDataProvider {

    /**
     * �������� ���������� � ������� Result
     */
    private Result result;

    /**
     * ����� ������� ����������� ����� ������ ������, ������� ������ ������
     */
    @BeforeMethod
    public void setUp() {
        result = new Result();
    }

    /**
     * DataProvider � ��������� ������� ��� ���������� ������
     *
     * @return ���������� ������ ��������� (return Object ��� DataProvider)
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
     * DataProvider � ��������� ������� ��� ����������� �����
     *
     * @return ���������� ������ ��������� (return Object ��� DataProvider)
     */
    @DataProvider
    public Object[][] getTestNegativeDataProvideResult() {
        return new Object[][]{
                {"100", "0", "/"},
        };
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestPositiveDataProvideResult", description = "Parametrized positive tests")
    public void testPositiveDataProvideResult(String one, String two, String operation, int expected) {
        assertEquals(result.Result(one, two, operation), expected);
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestNegativeDataProvideResult", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeDataProvideResult(String one, String two, String operation) {
        result.Result(one, two, operation);
    }
}
