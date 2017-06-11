package me.ohdyno.fractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    public void addingTwoFractionsShouldYieldCorrectResultAsAFraction() {
        Fraction sevenThirds = new Fraction(7, 3);
        Fraction fourFifths = new Fraction(4, 5);

        Fraction result = sevenThirds.add(fourFifths);
        assertEquals(new Fraction(47, 15), result);
    }
}
