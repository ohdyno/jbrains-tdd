package me.ohdyno.fractions;

public interface Fraction {
    Fraction ZERO = new SimpleFraction(0, 1);

    Fraction add(Fraction that);

    int getDenominator();

    int getNumerator();
}