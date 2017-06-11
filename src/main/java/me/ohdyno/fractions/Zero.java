package me.ohdyno.fractions;

import lombok.Value;

@Value
public class Zero implements Fraction {
    private final int numerator = 0;
    private final int denominator = 1;

    public Fraction add(Fraction that) {
        return that;
    }
}
