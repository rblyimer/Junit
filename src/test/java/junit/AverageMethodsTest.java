package junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageMethodsTest {

    @DisplayName("Test sum() method")
    @Test
    void testSum() {
        assertEquals(6, AverageMethods.sum(1,2,3));
    }
    @DisplayName("Test average() method")
    @Test
    void testAverage(){
        assertEquals(4,AverageMethods.average(3,4,5));
    }
}
