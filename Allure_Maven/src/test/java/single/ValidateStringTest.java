package single;

import exception.BadException;
import io.qameta.allure.*;
import model.ValidateString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ��������� ������ ��� ValidateString
 */
@Epic("Single tests")
@Feature("ValidateStringTest")
public class ValidateStringTest {

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
     * ���������� �������� ���������
     */
    @Test(description = "Positive multiplication check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive multiplication check")
    @Description("Positive multiplication test")
    public void testMultiplicationValidateString() {
        assertEquals(validateString.validateString("*"), "*");
    }

    /**
     * ���������� �������� ��������
     */
    @Test(description = "Positive addition check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive addition check")
    @Description("Positive addition test")
    public void testPlusValidateString() {
        assertEquals(validateString.validateString("+"), "+");
    }

    /**
     * ���������� �������� ���������
     */
    @Test(description = "Positive subtraction check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive subtraction check")
    @Description("Positive subtraction test")
    public void testMinusValidateString() {
        assertEquals(validateString.validateString("-"), "-");
    }

    /**
     * ���������� �������� �������
     */
    @Test(description = "Positive division check")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive division check")
    @Description("Positive division test")
    public void testDivideValidateString() {
        assertEquals(validateString.validateString("/"), "/");
    }

    /**
     * ���������� ��������, ���� ������ ������
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for empty string")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for empty string")
    @Description("The test checks for an empty string")
    public void testNegativeEmptyLineValidateString() {
        validateString.validateString("");
    }

    /**
     * ���������� ��������, ���� ������� �� ��������������� �������
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for inappropriate characters")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for inappropriate characters")
    @Description("Negative test for inappropriate characters")
    public void testNegativeStringValidateString() {
        validateString.validateString("Hello");
    }

    /**
     * ���������� ��������, ���� ������� ����� � ���� ��������
     */
    @Test(expectedExceptions = BadException.class, description = "Negative check for input of characters and numbers")
    @Severity(SeverityLevel.NORMAL)
    @Story("Negative check for input of characters and numbers")
    @Description("Negative test for entering characters and numbers")
    public void testNegativeNumberAndStringValidateString() {
        validateString.validateString("/57");
    }
}
