package me.ohdyno.users.fractions;

import me.ohdyno.fractions.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    @Test
    public void addingZeroesShouldYieldZeroAsResult() {
        Fraction zero = Fraction.ZERO;
        assertEquals(zero, zero.add(zero));
    }

}
