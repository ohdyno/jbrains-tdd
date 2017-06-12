package me.ohdyno.fractions;

class GreatestCommonDivisorCalculator {
    private final int a;
    private final int b;

    GreatestCommonDivisorCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        if (this.a == 0) {
            return this.b;
        }

        if (this.b == 0) {
            return this.a;
        }

        int divisor = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }
}
