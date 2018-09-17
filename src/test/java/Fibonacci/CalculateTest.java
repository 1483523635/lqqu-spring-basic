package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateTest {
    @Test
    void should_throw_exception_when_number_less_0() {
        Calculate calculate = new Calculate();
        assertThrows(IllegalArgumentException.class, () -> {
            calculate.getResult(-1);
        });
    }

    @Test
    void should_return_1_when_given_0() {
        Calculate calculate = new Calculate();
        assertEquals(1, calculate.getResult(0));
    }

    @Test
    void should_return_12586269025_when_given_50() {
        Calculate calculate = new Calculate();
        assertEquals(12586269025L, calculate.getResult(50));
    }

    @Test
    void should_throw_exception_when_given_number_bigger_than_50() {
        Calculate calculate = new Calculate();
        assertThrows(IllegalArgumentException.class, () -> {
            calculate.getResult(51);
        });
    }

}
