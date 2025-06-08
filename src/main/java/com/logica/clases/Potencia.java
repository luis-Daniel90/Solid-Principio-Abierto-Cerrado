package com.logica.clases;

import Interface.Calculadora;

public class Potencia implements Calculadora{
    int A;
    int B;

    public Potencia(int A, int B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double operacion() {
        return Math.pow(A, B);
    }
}
