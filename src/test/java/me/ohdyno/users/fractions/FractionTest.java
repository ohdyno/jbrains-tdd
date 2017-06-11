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

    @Test
    public void addingZeroToANonZeroFractionShouldYieldTheNonZeroFraction() {
        Fraction zero = Fraction.ZERO;
        Fraction fraction = new SimpleFraction(1, 3);

        assertEquals(fraction, zero.add(fraction));
        assertEquals(fraction, fraction.add(zero));
    }

    @Test
    public void addingTwoSimpleFractionsShouldYieldTheirSum() {
        Fraction twoThirds = new SimpleFraction(2, 3);
        Fraction fiveThirds = new SimpleFraction(5, 3);

        assertEquals(new SimpleFraction(7, 3), twoThirds.add(fiveThirds));
    }

    @Test
    public void reducingALowestTermFractionYieldsTheSameFraction() {
        Fraction twoThirds = new SimpleFraction(2, 3);
        assertEquals(new SimpleFraction(2, 3), twoThirds.reducedForm());
    }

}
