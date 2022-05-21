package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideMethodTest {
    @DisplayName("Test Divide() method")
    @Test
    void testDivide() {
        assertEquals(.5, Calculations.Division(1,2));
    }
}
