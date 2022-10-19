package com.raydya.ethan.math;

public class Combination {

    /**
     * _n C_r	=	number of combinations
     * <p>
     * n	=	total number of objects in the set
     * <p>
     * r	=	number of choosing objects from the set
     */
    public long c(final int n, final int r) {
        final Factorial f = new Factorial();
        return f.f(n) / (f.f(r) * f.f(n - r));
    }
}
