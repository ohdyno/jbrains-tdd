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
        Fraction fraction = new Fraction(1, 3);

        assertEquals(fraction, zero.add(fraction));
        assertEquals(fraction, fraction.add(zero));
    }

    @Test
    public void addingTwoFractionsShouldYieldTheirSum() {
        Fraction twoThirds = new Fraction(2, 3);
        Fraction fiveThirds = new Fraction(5, 3);

        assertEquals(new Fraction(7, 3), twoThirds.add(fiveThirds));
    }

    @Test
    public void addingFractionsThatSimplifyToWholeNumber() {
        assertEquals(new Fraction(2, 1), new Fraction(8, 9).add(new Fraction(10, 9)));
    }

    @Test
    public void addingFractionsThatEqualsZero() {
        assertEquals(Fraction.ZERO, new Fraction(1, 2).add(new Fraction(-1, 2)));
    }

    @Test
    public void creatingAFractionThatIsNotTheSimplestFormShouldYieldTheSimplestForm() {
        assertEquals(new Fraction(2, 3), new Fraction(2, 3));
        assertEquals(new Fraction(2, 3), new Fraction(2 * 2, 3 * 2));
        assertEquals(new Fraction(1, 3), new Fraction(1 * 4, 3 * 4));
    }

}
