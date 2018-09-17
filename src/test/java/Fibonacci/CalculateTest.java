package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateTest {


    @Test
    void should_throw_exception_when_number_less_1() {
        Calculate calculate = new Calculate();
        assertThrows(IllegalArgumentException.class, () -> {
            calculate.getResult(0);
        });
    }

    @Test
    void should_return_1_when_given_1() {
        Calculate calculate = new Calculate();
        assertEquals(1, calculate.getResult(1));
    }

    @Test
    void should_return_3_when_given_4() {
        Calculate calculate = new Calculate();
        assertEquals(3, calculate.getResult(4));
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

    @Test
    void get_first_10_numbers_in_fibonacci() {
        Calculate calculate = new Calculate();
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, calculate.getResultList());
    }

    @Test
    void should_throw_exception_when_get_11() {
        Calculate calculate = new Calculate();
        int[] result = calculate.getResultList();
        assertThrows(Exception.class, () -> {
            int t = result[11];
        });
    }

    @Test
    void should_throw_exception_when_get_less_1() {
        Calculate calculate = new Calculate();
        int[] result = calculate.getResultList();
        assertThrows(Exception.class, () -> {
            int t = result[-1];
        });
    }

    @Test
    void should_get_1_when_get_1() {
        Calculate calculate = new Calculate();
        int[] result = calculate.getResultList();
        assertEquals(1, result[0]);
    }

    @Test
    void should_get_55_when_get_10() {
        Calculate calculate = new Calculate();
        int[] result = calculate.getResultList();
        assertEquals(55, result[9]);
    }
}
