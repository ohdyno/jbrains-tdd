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
    @DisplayName("8/9 + 10/9 = 2/1")
    public void addingFractionsThatSimplifyToWholeNumber() {
        assertEquals(new Fraction(2, 1), new Fraction(8, 9).add(new Fraction(10, 9)));
    }

    @Test
    @DisplayName("x/n + -x/n = 0")
    public void addingFractionsThatEqualsZero() {
        assertEquals(Fraction.ZERO, new Fraction(1, 2).add(new Fraction(-1, 2)));
    }

    @Test
    @DisplayName("(x*n)/(y*n) = x/y")
    public void creatingAFractionThatIsNotTheSimplestFormShouldYieldTheSimplestForm() {
        assertEquals(new Fraction(2, 3), new Fraction(2, 3));
        assertEquals(new Fraction(2, 3), new Fraction(2 * 2, 3 * 2));
        assertEquals(new Fraction(1, 3), new Fraction(1 * 4, 3 * 4));
    }

    @Test
    @DisplayName("1/0 is an invalid fraction")
    public void creatingAFractionWithAZeroDenominatorThrowsIllegalArgumentException() {
        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class, () -> new Fraction(1, 0));
        assertEquals("Denominator cannot be 0.", thrownException.getMessage());
    }
}
