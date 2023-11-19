import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
@Epic("Gradle test")
@Feature("WritterTest")
public class WritterTest {

    @Test(description = "String return check Hello World")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive string test")
    @Description("The test for string Hello World")
    public void testPositiveStringTestText(){
        assertEquals(Writter.getText(), "Hello World!");
    }
}
