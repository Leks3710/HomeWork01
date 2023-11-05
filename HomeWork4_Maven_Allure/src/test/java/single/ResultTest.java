package single;

import exception.BadException;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ��������� ������ ��� Result
 */
public class ResultTest {

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
     * ���������� �������� ��������
     */
    @Test
    public void testPlusResult() {
        assertEquals(result.Result("10", "5", "+"), 15);
    }

    /**
     * ���������� �������� ���������
     */
    @Test
    public void testMultiplicationResult() {
        assertEquals(result.Result("500", "1000", "-"), -500);
    }

    /**
     * ���������� �������� ��������� ���� ������������� ����
     */
    @Test
    public void testMultiplicationMinusResult() {
        assertEquals(result.Result("-100", "-5", "*"), 500);
    }


    /**
     * ���������� �������� ��� ������� �� ����
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeDivideToZeroResult() {
        result.Result("-5", "0", "/");
    }

}




