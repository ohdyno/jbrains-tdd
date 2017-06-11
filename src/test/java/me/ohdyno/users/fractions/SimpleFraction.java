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
        return new SimpleFraction(numerator, commonDenominator).reducedForm();
    }

    @Override
    public Fraction reducedForm() {
        int maxPossibleDivisor = Math.min(this.numerator, this.denominator);
        int maxDivisor = calculateMaxDivisor(maxPossibleDivisor, this.numerator, this.denominator);
        return new SimpleFraction(this.numerator / maxDivisor, this.denominator / maxDivisor);
    }

    private int calculateMaxDivisor(int maxPossibleDivisor, int a, int b) {
        int maxDivisor = 1;
        for (int i = 2; i < maxPossibleDivisor; i++) {
            if (a % i == 0 && b % i == 0) {
                maxDivisor = i;
            }
        }

        return maxDivisor;
    }
}
