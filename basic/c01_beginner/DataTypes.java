package basic.c01_beginner;

public class DataTypes {

    public static void main(String[] args) {

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.77;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        System.out.println(myString.getClass().getSimpleName());
    }
}


