package com.logica.clases;

import Interface.Calculadora;

public class Multiplicacion implements Calculadora {

    double A;
    double B;

    public Multiplicacion(double A, double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double operacion() {
        return A * B;
    }
}
