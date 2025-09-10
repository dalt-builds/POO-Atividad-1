/*
=====================================
             PORTADA
=====================================
Autor: Daniel Alvarez Tamayo
Fecha: 09/09/2025
Materia: Programacion orientada a objetos

Descripcion:
    Ejercicio 1:
        Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
        retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
        la retención en la fuente y el salario neto del trabajador.
=====================================
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edadJuan, edadAlberto, edadAna, edadMama;
        Scanner entrada = new Scanner(System.in);

        //Pedir edad de Juan
        System.out.println("Ingrese la edad de Juan: ");
        double entradaJuan = entrada.nextDouble();
        edadJuan = (int)Math.round(entradaJuan);

        //Validar si es entero
        if (entradaJuan % 1 != 0) {
            System.out.println("La edad de Juan debe ser un número ENTERO, intentelo nuevamente");
            return; // Lo uso para finalizar 0el programa
        }
        //Calcular edades y quitar la decimal (.0)
        edadAlberto = (int)Math.round((2.0/3.0) * edadJuan);
        edadAna     = (int)Math.round((4.0/3.0) * edadJuan);
        edadMama    = edadJuan + edadAlberto + edadAna;

        //Mostrar edades
        System.out.println("La edad de Juan es: " + edadJuan);
        System.out.println("La edad de Alberto es: " + edadAlberto);
        System.out.println("La edad de Ana es: " + edadAna);
        System.out.println("La edad de la mama de Juan es: " + edadMama);
    }
}