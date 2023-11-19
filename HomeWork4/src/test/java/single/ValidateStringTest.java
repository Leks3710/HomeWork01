package single;

import exception.BadException;
import model.ValidateString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ��������� ������ ��� ValidateString
 */
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
    @Test
    public void testMultiplicationValidateString() {
        assertEquals(validateString.validateString("*"), "*");
    }

    /**
     * ���������� �������� ��������
     */
    @Test
    public void testPlusValidateString() {
        assertEquals(validateString.validateString("+"), "+");
    }

    /**
     * ���������� �������� ���������
     */
    @Test
    public void testMinusValidateString() {
        assertEquals(validateString.validateString("-"), "-");
    }

    /**
     * ���������� �������� �������
     */
    @Test
    public void testDivideValidateString() {
        assertEquals(validateString.validateString("/"), "/");
    }

    /**
     * ���������� ��������, ���� ������ ������
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeEmptyLineValidateString() {
        validateString.validateString("");
    }

    /**
     * ���������� ��������, ���� ������� �� ��������������� �������
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeStringValidateString() {
        validateString.validateString("Hello");
    }

    /**
     * ���������� ��������, ���� ������� ����� � ���� ��������
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeNumberAndStringValidateString() {
        validateString.validateString("/57");
    }
}
