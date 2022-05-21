package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComparisonTest {

    @DisplayName("Test NumberComparison() method")
    @Test
    void comparisonTest() {
        assertEquals("The numbers are the same", NumberComparison.comparison(1,1));
        assertEquals("The first number is less than the second number", NumberComparison.comparison(1,2));
        assertEquals("The first number is greater than the second number", NumberComparison.comparison(2,1));
    }

}