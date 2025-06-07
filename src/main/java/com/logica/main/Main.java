package com.logica.main;

import com.logica.clases.CalculadoraArea;
import com.logica.clases.Circulo;
import com.logica.clases.RealizarOperacion;
import com.logica.clases.Rectangulo;
import com.logica.clases.Suma;

import Interface.Calculadora;
import Interface.Figura;

public final class Main {
        public static void main(String[] args) {

        /*EJERCICIO:
        * Explora el "Principio SOLID Abierto-Cerrado (Open-Close Principle, OCP)"
        * y crea un ejemplo simple donde se muestre su funcionamiento
        * de forma correcta e incorrecta.
        */

        CalculadoraArea calculadora = new CalculadoraArea();

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 3);

        System.out.println("Área del círculo: " + calculadora.calcular(circulo));
        System.out.println("Área del rectángulo: " + calculadora.calcular(rectangulo));

        System.out.println();
        System.out.println("*************** EXTRA ****************");
        System.out.println();

         /* DIFICULTAD EXTRA (opcional):
            * Desarrolla una calculadora que necesita realizar diversas operaciones matemáticas.
            * Requisitos:
            * - Debes diseñar un sistema que permita agregar nuevas operaciones utilizando el OCP.
            * Instrucciones:
            * 1. Implementa las operaciones de suma, resta, multiplicación y división.
            * 2. Comprueba que el sistema funciona.
            * 3. Agrega una quinta operación para calcular potencias.
            * 4. Comprueba que se cumple el OCP.
        */

        RealizarOperacion resultado = new RealizarOperacion();

        Calculadora suma = new Suma(2, 02);
        System.out.println("La suma de los numeros es: " + resultado.resolver(suma) );

    }
}
