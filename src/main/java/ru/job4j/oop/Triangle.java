package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double semiperimeter(double ab, double bc, double ca) {
        return (ab + bc + ca) / 2.0;
    }

    public boolean exists(double ab, double bc, double ca) {
        return (ab + bc > ca) && (ab + ca > bc) && (bc + ca > ab);
    }

    public double area() {
        double rsl = -1;
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        if (exists(ab, bc, ca)) {
            double p = semiperimeter(ab, bc, ca);
            rsl = sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }
}
