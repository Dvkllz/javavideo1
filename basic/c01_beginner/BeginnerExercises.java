package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "David";
        System.out.println("Nombre: " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 20;
        System.out.println("Edad: " + age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.75;
        System.out.println("Altura: " + height + " m");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likesProgramming = true;
        System.out.println("¿Me gusta programar? " + likesProgramming);

        // 5. Declara una constante con tu email.
        final String EMAIL = "david@correo.com";
        System.out.println("Email: " + EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'D';
        System.out.println("Inicial: " + initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación
        // cambia su valor y vuelve a imprimirla.
        String locality = "Pasto";
        System.out.println("Localidad inicial: " + locality);
        locality = "Nariño";
        System.out.println("Localidad modificada: " + locality);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 8;
        int b = 4;
        System.out.println("a + b = " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Tipo de name: " + name.getClass().getSimpleName());
        System.out.println("Tipo de age: " + Integer.TYPE.getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un
        // valor antes de imprimirla.
        String favoriteLanguage;
        favoriteLanguage = "Java";
        System.out.println("Lenguaje favorito: " + favoriteLanguage);
    }
}
