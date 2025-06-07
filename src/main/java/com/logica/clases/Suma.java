package com.logica.clases;

import Interface.Calculadora;

public class Suma implements Calculadora{

    double A;
    double B;

    public Suma(double A, double B){
        this.A = A;
        this. B = B;
    }

    @Override
    public double operacion() {
        return A + B;
    }


}
