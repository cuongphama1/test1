import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerEquivalencePartitioningTest {

    @Test
    void testIsPrimeForOddNumbers() {
        // Kiểm tra các số lẻ
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(15));
    }

    @Test
    void testIsPrimeForEvenNumbers() {
        // Kiểm tra các số chẵn
        assertTrue(PrimeChecker.isPrime(2));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(10));
    }
}
