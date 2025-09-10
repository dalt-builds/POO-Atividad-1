/*
=====================================
             PORTADA
=====================================
Autor: Daniel Alvarez Tamayo
Fecha: 09/09/2025
Materia: Programacion orientada a objetos

Descripcion:
    Ejercicio 4:
        Elabore un algoritmo que lea un numero y obtenga su cuadrado y su cubo
=====================================
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numero, numero_cuadrado, numero_cubo;
        Scanner entrada= new Scanner(System.in);

        //Pedir el numero
        System.out.println("Ingrese un numero para obtener su cuadrado y su cubo: ");
        numero = entrada.nextDouble();

        //Calcular cuadrado y cubo
        numero_cuadrado = Math.pow(numero, 2);
        numero_cubo =Math.pow(numero, 3);

        //Mostrar resultados
        System.out.println("El numero " + numero + "elevado al cuadrado es: " + numero_cuadrado);
        System.out.println("El numero " + numero + "elevado al cubo es: " + numero_cubo);
    }
}