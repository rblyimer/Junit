package junit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperheroTest {
    @DisplayName("Test SuperHero() method")
    @Test
    void testSuperHero() {
        String name = "SpiderMan";
        InputStream input = new ByteArrayInputStream(name.getBytes());
        System.setIn(input);
        assertEquals("The hero of our story is SpiderMan", SuperHero.superHero());
    }

    // @DisplayName("Test SuperPower() method")
    // @Test
    // void testSuperPower() {
    //     String superPower = "Webs";
    //     InputStream input = new ByteArrayInputStream(superPower.getBytes());
    //     System.setIn(input);
    //     assertEquals("Their superpower is Webs", SuperHero.superPower());
    // }
}
