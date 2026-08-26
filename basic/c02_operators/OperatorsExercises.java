package basic.c02_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

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

        System.out.println(a > b);
        System.out.println(a != b);
        System.out.println(a >= 10);

        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(b >= a);

        boolean andResult = a > b && b > 0;
        System.out.println("AND: " + andResult);

        boolean orResult = a < b || b == 3;
        System.out.println("OR: " + orResult);

        boolean combinedResult = (a > b && b > 0) || a == 0;
        System.out.println("AND y OR: " + combinedResult);

        boolean negation = !(a == b);
        System.out.println("Negación: " + negation);

        int number = 5;
        System.out.println("Negativo: " + (-number));
        System.out.println("Preincremento: " + (++number));
        System.out.println("Predecremento: " + (--number));

        boolean finalResult = (a + b > 12) && (a - b == 7) || (a * b < 20);
        System.out.println("Combinación final: " + finalResult);
    }
}

