/*
=====================================
             PORTADA
=====================================
Autor: Daniel Alvarez Tamayo
Fecha: 09/09/2025
Materia: Programacion orientada a objetos

Descripcion:
    Ejercicio 5:
        Dado el radio de un circulo. Haga un algoritmo que obtenga el area del circulo
        y la longitud de la circunferencia
=====================================
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        double radio, area, longitud_circunferencia;
        Scanner entrada = new Scanner(System.in);

        //Pedir el radio
        System.out.println("Ingrese el radio del circulo: ");
        radio = entrada.nextDouble();

        //Calcular area y longitud de circunferencia
        area = Math.PI * Math.pow(radio, 2);
        longitud_circunferencia = 2 * Math.PI * radio;

        //Aproximar a 2 decimales
        area = Math.round(area * 100.0) / 100.0;
        longitud_circunferencia = Math.round(longitud_circunferencia * 100.0) / 100.0;

        //Mostrar resultados
        System.out.println("El area del círculo con radio " + radio + " es: " + area);
        System.out.println("La longitud de la circunferencia con radio " + radio + " es: " + longitud_circunferencia);
    }
}