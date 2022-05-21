package junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount Savings = new BankAccount("Matt", 5000, 01);
    
    @DisplayName("Test Deposit() method")
    @Test
    void testDeposit() {
        Savings.deposit(1000);
        assertEquals(Savings.getBalance(), 6000);
    }
}