package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseIntegerTest {
    @Test
    public void test(){
        ReverseInteger reverseInt = new ReverseInteger();
        assert(reverseInt.reverse(123) == 321);
        assert(reverseInt.reverse(-123) == -321);
        assert(reverseInt.reverse(0) == 0);
        assert(reverseInt.reverse(1) == 1);
        assert(reverseInt.reverse(-1) == -1);
        assert(reverseInt.reverse(120) == 21);
        assert(reverseInt.reverse(102) == 201);
    }

    @Test
    public void test_whenExceptionThrown() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ReverseInteger reverseInt = new ReverseInteger();
            reverseInt.reverse(1147483648);
        });
        assertNotNull(exception.getMessage());
    }
}
