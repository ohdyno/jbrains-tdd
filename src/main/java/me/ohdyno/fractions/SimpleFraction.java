package me.ohdyno.fractions;

import lombok.Value;

@Value
public class SimpleFraction implements Fraction {
    private final int numerator;
    private final int denominator;

    public SimpleFraction(int numerator, int denominator) {
        int divisor = new GreatestCommonDivisorCalculator(numerator, denominator).calculate();
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;
    }

    public Fraction add(Fraction that) {
        int commonDenominator = that.getDenominator() * this.denominator;
        int numerator = that.getNumerator() * this.denominator + this.numerator * that.getDenominator();
        return new SimpleFraction(numerator, commonDenominator);
    }
}