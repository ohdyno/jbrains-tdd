package me.ohdyno.users.fractions;

import lombok.Value;
import me.ohdyno.fractions.Fraction;

@Value
public class SimpleFraction implements Fraction {
    private final int numerator;
    private final int denominator;

    public SimpleFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        int commonDenominator = that.getDenominator() * this.denominator;
        int numerator = that.getNumerator() * this.denominator + this.numerator * that.getDenominator();
        return new SimpleFraction(numerator, commonDenominator);
    }
}
