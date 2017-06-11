package me.ohdyno.fractions;

import lombok.Value;

@Value
public class Zero implements Fraction {
    public Fraction add(Fraction that) {
        return that;
    }
}
