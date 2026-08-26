package basic.c03_strings;

public class StringsExercises {

    public static void main(String[] args) {

        String firstText = "Hola";
        String secondText = "Java";

        String concatenatedText = firstText + ", " + secondText;
        System.out.println("Concatenación: " + concatenatedText);

        System.out.println("Longitud: " + concatenatedText.length());

        String word = "Programación";
        System.out.println("Primer carácter: " + word.charAt(0));
        System.out.println("Último carácter: " + word.charAt(word.length() - 1));

        System.out.println("Mayúsculas: " + word.toUpperCase());
        System.out.println("Minúsculas: " + word.toLowerCase());

        String sentence = "Estoy aprendiendo Java desde cero";
        System.out.println("¿Contiene Java? " + sentence.contains("Java"));

        int completedExercises = 50;
        String formattedText = String.format("He completado %d ejercicios.", completedExercises);
        System.out.println(formattedText);

        String textWithSpaces = "   Curso de Java   ";
        System.out.println("Sin espacios exteriores: '" + textWithSpaces.trim() + "'");

        String textWithHyphens = sentence.replace(" ", "-");
        System.out.println("Con guiones: " + textWithHyphens);

        String textA = "Java";
        String textB = new String("Java");
        System.out.println("¿Son iguales? " + textA.equals(textB));

        String textC = "Curso";
        String textD = "Clases";
        boolean sameLength = textC.length() == textD.length();
        System.out.println("¿Tienen la misma longitud? " + sameLength);
    }
}
