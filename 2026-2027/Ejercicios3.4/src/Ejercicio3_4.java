import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // Todos los ejercicios con el random

    /*
     * Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba
     * tantas líneas como diga
     * el número y en cada línea escriba desde el número 1 hasta el número
     * introducido.
     * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
     * 12345
     * 12345
     * 12345
     * 12345
     * 12345
     */
    public static void ejercicio1() {
        System.out.println("=== Ejercicio 1 ===");

        System.out.println();
    }

    /*
     * Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en
     * este caso deberá
     * escribir los números en orden decreciente, es decir, si introducimos el
     * número 5 deberá mostrar en
     * pantalla:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    public static void ejercicio2() {
        System.out.println("=== Ejercicio 2 ===");

        System.out.println();
    }

    /*
     * Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar
     * de escribir en lugar de
     * imprimir en todas las líneas todos los números desde el 1 hasta el
     * introducido por teclado, en la
     * primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así
     * hasta escribir el número
     * de líneas indicadas por el usuario.
     * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void ejercicio3() {
        System.out.println("=== Ejercicio 3 ===");

        System.out.println();
    }

    /*
     * Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de
     * 7 en 7, es decir,
     * mostrará 100, 93, 86...0.
     */
    public static void ejercicio4() {
        System.out.println("=== Ejercicio 4 ===");

        System.out.println();
    }

    /*
     * Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres
     * leer. Nosotros deberemos leer la cantidad de números indicada y calcula el
     * promedio de los
     * valores indicados. .
     */
    public static void ejercicio5() {
        System.out.println("=== Ejercicio 5 ===");

        System.out.println();
    }

    /*
     * Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si
     * el número es o no
     * primo. (Los números primos son aquellos que sólo son divisibles por ellos
     * mismos y por la unidad).
     */
    public static void ejercicio6() {
        System.out.println("=== Ejercicio 6 ===");

        System.out.println();

    }

    /*
     * Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0,
     * y nos muestre el
     * máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como
     * número introducido, solo
     * como valor de salida.
     */
    public static void ejercicio7() {
        System.out.println("=== Ejercicio 7 ===");

        System.out.println();
    }

    /*
     * Ejercicio 8: Escribe un programa en Java que implemente una calculadora
     * simple. La calculadora
     * debe permitir a los usuarios realizar operaciones matemáticas básicas, como
     * suma, resta,
     * multiplicación y división. El programa deberá mostrar un menú con las
     * siguientes opciones:
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Es primo (indica si el número introducido es primo o no lo es)
     * 6. Salir
     * Cuando el usuario selecciona una opción (del 1 al 5), el programa debe
     * solicitar los números
     * necesarios para realizar la operación y mostrar el resultado de dicha
     * operación. El programa debe
     * repetir el proceso hasta que el usuario seleccione la opción "Salir".
     * La opción “Salir” muestra un mensaje de despedida y finaliza la ejecución del
     * programa
     */
    public static void ejercicio8() {
        System.out.println("=== Ejercicio 8 ===");

        System.out.println();

    }

    /*
     * Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
     * o 1º Pediremos el DNI por teclado al usuario.
     * o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
     * quedándonos con el
     * resto de la división, que debe estar entre 0 y 22.
     * o Comprobaremos en la siguiente tabla, en función del resto obtenido en el
     * paso anterior, cuál
     * es la letra que corresponde
     * 
     * RESTO LETRA RESTO LETRA
     * 0 T 12 N
     * 1 R 13 J
     * 2 W 14 Z
     * 3 A 15 S
     * 4 G 16 Q
     * 5 M 17 V
     * 6 Y 18 H
     * 7 F 19 L
     * 8 P 20 C
     * 9 D 21 K
     * 10 X 22 E
     * 11 B
     * Ejemplo: Si introduzco el número 70588387, el resto de la división con 23 es
     * 7, por lo que le
     * corresponde la letra “F”.
     */
    public static void ejercicio9() {
        System.out.println("=== Ejercicio 9 ===");

        System.out.println();
    }

    /*
     * Ejercicio 10: Solicita al usuario una cadena y comprueba el número de vocales
     * que tiene.
     * Deberás usar el método charAT(i) de la clase String para extraer un carácter
     * de la cadena, donde i es
     * la posición del carácter de la cadena que queremos obtener. Por ejemplo, si
     * quisiéramos obtener el
     * carácter número de 5 de una cadena lo haríamos así: cadena.charAT(i)
     */
    public static void ejercicio10() {
        System.out.println("=== Ejercicio 10 ===");

        System.out.println();
    }

    /*
     * Ejercicio 11: Realiza el control de acceso a una caja fuerte. La combinación
     * será un número de cuatro
     * cifras. El usuario tendrá 4 oportunidades para averiguar el número.
     * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos
     * mostrará el mensaje
     * “Clave incorrecta le quedan X intentos”, si agota los 4 intentos mostrará el
     * mensaje “Lo siento has
     * agotado las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja
     * fuerte”.
     */
    public static void ejercicio11() {
        System.out.println("=== Ejercicio 11 ===");

        System.out.println();
    }

    /*
     * Ejercicio 12: Realiza un programa que compruebe si dos números son amigos.
     * Para ello hay que
     * comprobar que la suma de todos los divisores del primer número (sin contar
     * con él) es el segundo
     * número, y que la suma de todos los divisores propios del segundo número (sin
     * contar con él) es el
     * primer número. Por ejemplo:
     * - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
     * Su suma es 284.
     * - Los divisores propios de 284 son 1, 2, 4, 71 y 142. Su suma es 220.
     * - Por tanto, 220 y 284 son amigos.
     */
    public static void ejercicio12() {
        System.out.println("=== Ejercicio 12 ===");

        System.out.println();
    }

    /*
     * Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado
     * de elementos de la
     * serie de Fibonacci, teniendo en cuenta que cada uno es la suma de los dos
     * elementos anteriores, con la excepción de los dos primeros, que son 0 y 1.
     * Así, la serie estaría formada por los números: 0, 1, 1,
     * 2, 3, 5, 8, 13, 21...
     */
    public static void ejercicio13() {
        System.out.println("=== Ejercicio 13 ===");

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        scanner.close();
    }
}
