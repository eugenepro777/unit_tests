package homework3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @AfterEach
    void tearDown() {
        service = null;
    }

    @Test
    @DisplayName("Проверка метода для утверждения числа на четность или нечетность")
    void isEvenOddNumber() {
        assertTrue(service.isEvenOddNumber(2));
        assertFalse(service.isEvenOddNumber(5));
    }

    @Test
    @DisplayName("Проверка метода для вхождения числа в интервал (25;100)")
    void isNumberInInterval() {
        assertTrue(service.isNumberInInterval(36));
        assertFalse(service.isNumberInInterval(101));
        assertFalse(service.isNumberInInterval(24));
    }
}