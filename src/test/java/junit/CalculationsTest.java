package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @DisplayName("Test Addition() method")
    @Test
    void testAddition() {
        assertEquals(3, Calculations.Addition(1,2));
    }

    @DisplayName("Test Subtraction() method")
    @Test
    void testSubtraction() {
        assertEquals(-1, Calculations.Subtraction(1,2));
    }

    @DisplayName("Test Multiplication() method")
    @Test
    void testMultiplication() {
        assertEquals(2, Calculations.Multiplication(1,2));
    }

    @DisplayName("Test Division() method")
    @Test
    void testDivision() {
        assertEquals(.5, Calculations.Division(1,2));
    }

    @DisplayName("Test Modulus() method")
    @Test
    void testModulus() {
        assertEquals(1, Calculations.Modulus(1,2));
    }
}