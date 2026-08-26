package basic.c01_beginner;

public class BeginnerExercises {

    public static void main(String[] args) {

        String name = "David";
        System.out.println("Nombre: " + name);

        int age = 20;
        System.out.println("Edad: " + age);

        double height = 1.75;
        System.out.println("Altura: " + height + " m");

        boolean likesProgramming = true;
        System.out.println("¿Me gusta programar? " + likesProgramming);

        final String EMAIL = "david@correo.com";
        System.out.println("Email: " + EMAIL);

        char initial = 'D';
        System.out.println("Inicial: " + initial);

        String locality = "Pasto";
        System.out.println("Localidad inicial: " + locality);
        locality = "Nariño";
        System.out.println("Localidad modificada: " + locality);

        int a = 8;
        int b = 4;
        System.out.println("a + b = " + (a + b));

        System.out.println("Tipo de name: " + name.getClass().getSimpleName());
        System.out.println("Tipo de age: " + Integer.TYPE.getSimpleName());

        String favoriteLanguage;
        favoriteLanguage = "Java";
        System.out.println("Lenguaje favorito: " + favoriteLanguage);
    }
}

