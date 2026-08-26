package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola, David!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        String course = "Java"; // Guarda el nombre del curso en una variable.
        System.out.println(course); // Muestra el contenido de la variable.

        // 4. Crea un comentario en varias líneas.
        /*
         * Este es un comentario de varias líneas.
         * Java ignora su contenido al compilar el programa.
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 20 años");
        System.out.println("Color favorito: azul");
        System.out.println("Ciudad: Pasto");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        // System.err también es un PrintStream y permite usar println.
        System.err.println("Este mensaje se imprime en la salida de errores.");
        // System.in es la entrada estándar y no posee un método println.

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Estoy aprendiendo");
        System.out.println("Java desde cero");
        System.out.println("paso a paso.");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("  _____  ");
        System.out.println(" /     \\ ");
        System.out.println("|  o o  |");
        System.out.println("|   ^   |");
        System.out.println("| \\___/ |");
        System.out.println(" \\_____/ ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // Resultado comprobado: la JVM informa que no encuentra el método main.
        // Se conserva main para que esta entrega pueda ejecutarse correctamente.

        // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // Resultado comprobado: javac indica que una clase pública debe declararse
        // en un archivo con el mismo nombre; por ejemplo, esta clase exige
        // el nombre HelloWorldExercises.java.
    }
}
