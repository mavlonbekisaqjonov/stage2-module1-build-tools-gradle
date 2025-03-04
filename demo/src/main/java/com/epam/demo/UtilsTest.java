package com.epam.demo;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testAllPositiveNumbers() {
        List<String> numbers = Arrays.asList("1", "2", "3", "4");
        assertTrue(Utils.isAllPositiveNumbers(numbers), "All numbers should be positive");
    }

    @Test
    void testNegativeNumbers() {
        List<String> numbers = Arrays.asList("1", "-2", "3");
        assertFalse(Utils.isAllPositiveNumbers(numbers), "Should return false for negative numbers");
    }

    @Test
    void testInvalidNumbers() {
        List<String> numbers = Arrays.asList("abc", "123", "4.5");
        assertFalse(Utils.isAllPositiveNumbers(numbers), "Should return false for non-numeric values");
    }

    @Test
    void testEmptyList() {
        List<String> numbers = Arrays.asList();
        assertFalse(Utils.isAllPositiveNumbers(numbers), "Empty list should return false");
    }
}
