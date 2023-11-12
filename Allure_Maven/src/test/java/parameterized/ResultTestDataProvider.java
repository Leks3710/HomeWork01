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
    public Object[][] getTestPositiveResult() {
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
    public Object[][] getTestNegativeResult() {
        return new Object[][]{
                {"100", "0", "/"},
        };
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestPositiveResult", description = "Parametrized positive tests")
    public void testPositiveResult(String one, String two, String operation, int expected) {
        assertEquals(result.Result(one, two, operation), expected);
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestNegativeResult", expectedExceptions = BadException.class, description = "Parametrized negative tests")
    public void testNegativeResult(String one, String two, String operation) {
        result.Result(one, two, operation);
    }
}
