package me.ohdyno.fractions;

public class GreatestCommonDivisorCalculator {
    private final int a;
    private final int b;

    public GreatestCommonDivisorCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        int divisor = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }
}