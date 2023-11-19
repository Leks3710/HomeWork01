package parameterized;

import exception.BadException;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ������ c DataProvider ��� ������ Result
 */
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
    @Test(dataProvider = "getTestPositiveResult")
    public void testPositiveResult(String one, String two, String operation, int expected) {
        assertEquals(result.Result(one, two, operation), expected);
    }

    /**
     * ������������������� ���������� ����
     */
    @Test(dataProvider = "getTestNegativeResult", expectedExceptions = BadException.class)
    public void testNegativeResult(String one, String two, String operation) {
        result.Result(one, two, operation);
    }
}
