package me.ohdyno.fractions;

import lombok.Value;

@Value
public class Fraction {
    public static final Fraction ZERO = new Fraction(0, 1);

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0.");
        }
        int divisor = new GreatestCommonDivisorCalculator(numerator, denominator).calculate();
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;
    }

    public Fraction add(Fraction that) {
        int commonDenominator = that.getDenominator() * this.denominator;
        int numerator = that.getNumerator() * this.denominator + this.numerator * that.getDenominator();
        return new Fraction(numerator, commonDenominator);
    }
}