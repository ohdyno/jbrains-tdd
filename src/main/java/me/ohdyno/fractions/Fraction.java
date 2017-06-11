package me.ohdyno.fractions;

public interface Fraction {
    Fraction ZERO = new Zero();

    Fraction add(Fraction that);

    int getDenominator();

    int getNumerator();

    default Fraction reducedForm() {
        return this;
    }
}