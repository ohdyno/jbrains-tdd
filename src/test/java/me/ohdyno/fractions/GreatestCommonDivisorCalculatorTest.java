package me.ohdyno.fractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorCalculatorTest {
    @Test
    public void gcdOfOneAndAnythingElseIsOne() {
        assertEquals(1, new GreatestCommonDivisorCalculator(1, 16).calculate());
        assertEquals(1, new GreatestCommonDivisorCalculator(1, 2).calculate());
        assertEquals(1, new GreatestCommonDivisorCalculator(2, 1).calculate());
    }

    @Test
    public void gcdOfAnyTwoNumbers() {
        int multiplier = 3;
        assertEquals(multiplier, new GreatestCommonDivisorCalculator(1 * multiplier, 4 * multiplier).calculate());
        assertEquals(multiplier, new GreatestCommonDivisorCalculator(3 * multiplier, 5 * multiplier).calculate());
    }

    @Test
    public void gcdOfZeroAndNIsN() {
        int n = 3;
        assertEquals(n, new GreatestCommonDivisorCalculator(0, n).calculate());
        assertEquals(n, new GreatestCommonDivisorCalculator(n, 0).calculate());
    }

}