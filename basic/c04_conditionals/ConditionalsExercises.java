package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 20;
        if (age >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int firstNumber = 15;
        int secondNumber = 9;
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " es mayor que " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " es mayor que " + firstNumber + ".");
        } else {
            System.out.println("Los dos números son iguales.");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int number = -4;
        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int parityNumber = 17;
        if (parityNumber % 2 == 0) {
            System.out.println(parityNumber + " es par.");
        } else {
            System.out.println(parityNumber + " es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int rangeNumber = 75;
        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println(rangeNumber + " está en el rango de 1 a 100.");
        } else {
            System.out.println(rangeNumber + " está fuera del rango de 1 a 100.");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El día debe estar entre 1 y 7.");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).
        int grade = 88;
        if (grade < 0 || grade > 100) {
            System.out.println("La nota debe estar entre 0 y 100.");
        } else if (grade >= 90) {
            System.out.println("Sobresaliente");
        } else if (grade >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes
        // tener al menos 15 años o ir acompañado.
        int cinemaAge = 13;
        boolean isAccompanied = true;
        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine.");
        } else {
            System.out.println("No puede entrar al cine.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letter = 'e';
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " es una vocal.");
                break;
            default:
                System.out.println(letter + " es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 8;
        int b = 21;
        int c = 13;
        int greatest = a;
        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        System.out.println("El mayor de los tres números es: " + greatest);
    }
}
