package me.ohdyno.fractions;

public interface Fraction {
    Fraction ZERO = new Zero();

    Fraction add(Fraction that);
}