package com.logica.clases;

import Interface.Calculadora;

public class Division implements Calculadora {

    double A;
    double B;

    public Division(double A, double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double operacion() {
        return A / B;
    }
}
