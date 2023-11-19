import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
@Epic("Gradle test")
@Feature("WritterTest")
public class WritterTest {

    @Test(description = "Positive string test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Positive string test")
    @Description("The test for string verification")
    public void testText(){
        assertEquals(Writter.getText(), "Hello World!");
    }
}
