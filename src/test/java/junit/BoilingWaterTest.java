package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoilingWaterTest {

    @DisplayName("Test BoilingWater() method")
    @Test
    void testWaterBoiling() {
        assertEquals("Water is boiling!", BoilingWater.WaterBoiling(213));
        assertEquals("Water is not boiling!", BoilingWater.WaterBoiling(211));
    }
}
