import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    void testIsPrime() {
        // Kiểm tra số -5, kết quả mong đợi là False
        assertFalse(PrimeChecker.isPrime(-5));

        // Kiểm tra số 0, kết quả mong đợi là False
        assertFalse(PrimeChecker.isPrime(0));

        // Kiểm tra số 1, kết quả mong đợi là False
        assertFalse(PrimeChecker.isPrime(1));

        // Kiểm tra số 2, kết quả mong đợi là True
        assertTrue(PrimeChecker.isPrime(2));

        // Kiểm tra số 3, kết quả mong đợi là True
        assertTrue(PrimeChecker.isPrime(3));

        // Kiểm tra số 4, kết quả mong đợi là False
        assertFalse(PrimeChecker.isPrime(4));

        // Kiểm tra số 5, kết quả mong đợi là True
        assertTrue(PrimeChecker.isPrime(5));

        // Kiểm tra số 17, kết quả mong đợi là True
        assertTrue(PrimeChecker.isPrime(17));

        // Kiểm tra số 20, kết quả mong đợi là False
        assertFalse(PrimeChecker.isPrime(20));

        // Kiểm tra số 97, kết quả mong đợi là True
        assertTrue(PrimeChecker.isPrime(97));
    }
}
