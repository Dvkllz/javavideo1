package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        String firstText = "Hola";
        String secondText = "Java";

        // 1. Concatena dos cadenas de texto.
        String concatenatedText = firstText + ", " + secondText;
        System.out.println("Concatenación: " + concatenatedText);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud: " + concatenatedText.length());

        // 3. Muestra el primer y último carácter de un string.
        String word = "Programación";
        System.out.println("Primer carácter: " + word.charAt(0));
        System.out.println("Último carácter: " + word.charAt(word.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("Mayúsculas: " + word.toUpperCase());
        System.out.println("Minúsculas: " + word.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String sentence = "Estoy aprendiendo Java desde cero";
        System.out.println("¿Contiene Java? " + sentence.contains("Java"));

        // 6. Formatea un string con un entero.
        int completedExercises = 50;
        String formattedText = String.format("He completado %d ejercicios.", completedExercises);
        System.out.println(formattedText);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String textWithSpaces = "   Curso de Java   ";
        System.out.println("Sin espacios exteriores: '" + textWithSpaces.trim() + "'");

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String textWithHyphens = sentence.replace(" ", "-");
        System.out.println("Con guiones: " + textWithHyphens);

        // 9. Comprueba si dos strings son iguales.
        String textA = "Java";
        String textB = new String("Java");
        System.out.println("¿Son iguales? " + textA.equals(textB));

        // 10. Comprueba si dos strings tienen la misma longitud.
        String textC = "Curso";
        String textD = "Clases";
        boolean sameLength = textC.length() == textD.length();
        System.out.println("¿Tienen la misma longitud? " + sameLength);
    }
}
