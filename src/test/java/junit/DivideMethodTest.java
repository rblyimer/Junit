package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DivideMethodTest {
    @DisplayName("Test Divide() method")
    @Test
    void testDivide() {
        Assertions.assertEquals(0.5, DivideMethod.Divide(1,2));
    }
}
