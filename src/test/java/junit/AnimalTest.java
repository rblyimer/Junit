package junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {
    @DisplayName("Test Animal() method")
    @Test
    void getDogName() {
        Animal animal = new Animal("Charlie", true);
        assertEquals("Charlie", animal.getName());
    }
}
