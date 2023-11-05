package single;

import exception.BadException;
import model.ValidateNumber;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ����� ��������� ������ ��� ValidateNumber
 */
public class ValidateNumberTest {

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
     * ���������� �������� ������ �����
     */
    @Test
    public void testPutPositiveNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("10"), "10");
    }

    /**
     * ���������� �������� �������������� �����
     */
    @Test
    public void testPutNegativeNumberValidateNumber() {
        assertEquals(validateNumber.validateNumber("-99"), "-99");
    }

    /**
     * ���������� �������� ����� 0
     */
    @Test
    public void testPutZeroValidateNumber() {
        assertEquals(validateNumber.validateNumber("0"), "0");
    }

    /**
     * ���������� ��������, ���� ������� �� �����
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeSymbolsValidateNumber() {
        validateNumber.validateNumber("Hello&%");
    }

    /**
     * ���������� ��������, ���� ������ ������
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeEmptyLineValidateNumber() {
        validateNumber.validateNumber("");
    }

    /**
     * ���������� ��������, ���� ������� ����� � �������
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeNumberValidateNumber() {
        validateNumber.validateNumber("5-5");
    }

    /**
     * ���������� ��������, ���� ������ ���� � �����
     */
    @Test(expectedExceptions = BadException.class)
    public void testNegativeSymbolsStringValidateNumber() {
        validateNumber.validateNumber("+5");
    }
}
