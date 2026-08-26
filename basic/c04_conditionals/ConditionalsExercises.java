package basic.c04_conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {

        int age = 20;
        if (age >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }

        int firstNumber = 15;
        int secondNumber = 9;
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " es mayor que " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " es mayor que " + firstNumber + ".");
        } else {
            System.out.println("Los dos números son iguales.");
        }

        int number = -4;
        if (number > 0) {
            System.out.println("El número es positivo.");
        } else if (number < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        int parityNumber = 17;
        if (parityNumber % 2 == 0) {
            System.out.println(parityNumber + " es par.");
        } else {
            System.out.println(parityNumber + " es impar.");
        }

        int rangeNumber = 75;
        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println(rangeNumber + " está en el rango de 1 a 100.");
        } else {
            System.out.println(rangeNumber + " está fuera del rango de 1 a 100.");
        }

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

        int cinemaAge = 13;
        boolean isAccompanied = true;
        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine.");
        } else {
            System.out.println("No puede entrar al cine.");
        }

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

