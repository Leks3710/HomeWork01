package single;

import exception.BadException;
import io.qameta.allure.*;
import operation.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ��������� ������ ��� Result
 */
@Epic("Single tests")
@Feature("ResultTest")
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
    @Test(description = "Positive addition test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive addition test")
    @Description("The test checks for addition")
    public void testPlusResult() {
        assertEquals(result.Result("10", "5", "+"), 15);
    }

    /**
     * ���������� �������� ���������
     */
    @Test(description = "Positive subtraction test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive subtraction test")
    @Description("The test checks for subtraction")
    public void testMultiplicationResult() {
        assertEquals(result.Result("500", "1000", "-"), -500);
    }

    /**
     * ���������� �������� ��������� ���� ������������� ����
     */
    @Test(description = "Positive verification of multiplication of two negative digits")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive verification of multiplication of two negative digits")
    @Description("The test checks the multiplications of two negative digits")
    public void testMultiplicationMinusResult() {
        assertEquals(result.Result("-100", "-5", "*"), 500);
    }


    /**
     * ���������� �������� ��� ������� �� ����
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check when dividing by zero")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Negative check when dividing by zero")
    @Description("The test checks for division by zero")
    public void testNegativeDivideToZeroResult() {
        result.Result("-5", "0", "/");
    }

}




