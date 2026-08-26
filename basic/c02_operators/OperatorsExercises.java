package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;
        int remainder = a % b;
        System.out.println("Suma: " + addition);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + remainder);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int simpleAssignment = 5;
        int additionAssignment = 5;
        additionAssignment += 2;
        int subtractionAssignment = 5;
        subtractionAssignment -= 2;
        int multiplicationAssignment = 5;
        multiplicationAssignment *= 2;
        int divisionAssignment = 10;
        divisionAssignment /= 2;
        int remainderAssignment = 10;
        remainderAssignment %= 3;
        System.out.println("Asignación simple: " + simpleAssignment);
        System.out.println("Asignación con suma: " + additionAssignment);
        System.out.println("Asignación con resta: " + subtractionAssignment);
        System.out.println("Asignación con multiplicación: " + multiplicationAssignment);
        System.out.println("Asignación con división: " + divisionAssignment);
        System.out.println("Asignación con módulo: " + remainderAssignment);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a > b);
        System.out.println(a != b);
        System.out.println(a >= 10);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(b >= a);

        // 5. Utiliza el operador lógico and.
        boolean andResult = a > b && b > 0;
        System.out.println("AND: " + andResult);

        // 6. Utiliza el operador lógico or.
        boolean orResult = a < b || b == 3;
        System.out.println("OR: " + orResult);

        // 7. Combina ambos operadores lógicos.
        boolean combinedResult = (a > b && b > 0) || a == 0;
        System.out.println("AND y OR: " + combinedResult);

        // 8. Añade alguna negación.
        boolean negation = !(a == b);
        System.out.println("Negación: " + negation);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int number = 5;
        System.out.println("Negativo: " + (-number));
        System.out.println("Preincremento: " + (++number));
        System.out.println("Predecremento: " + (--number));

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean finalResult = (a + b > 12) && (a - b == 7) || (a * b < 20);
        System.out.println("Combinación final: " + finalResult);
    }
}
