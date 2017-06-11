package me.ohdyno.fractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    @Test
    public void addingZeroesShouldYieldZeroAsResult() {
        Fraction zero = new Zero();
        assertEquals(zero, zero.add(zero));
    }

}
