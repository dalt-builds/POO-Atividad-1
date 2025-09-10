/*
=====================================
             PORTADA
=====================================
Autor: Daniel Alvarez Tamayo
Fecha: 09/09/2025
Materia: Programacion orientada a objetos

Descripcion:
    Ejercicio 3:
        Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
        retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
        la retención en la fuente y el salario neto del trabajador.
=====================================
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        double salario_bruto, retencion, salario_neto;

        //Calcular los datos a mostrar
        retencion = 0.125 * (48 * 5000);
        salario_bruto = 48 * 5000;
        salario_neto = (48 * 5000) - ((48 * 5000) * 0.125);

        //Mostrar resultado de los calculos
        System.out.println("El salario bruto del trabajador es: " + salario_bruto);
        System.out.println("La retencion en la fuente del trabajador es: " + retencion);
        System.out.println("El salario neto del trabajador es: " + salario_neto);

    }
}

