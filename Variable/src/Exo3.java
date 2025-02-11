public class Exo3 {
    public static void main(String[] args) {
        // Déclaration de variables primitives
        byte aByte = 127;               // Valeur max pour un byte
        short aShort = 32767;           // Valeur max pour un short
        int anInt = 2147483647;         // Valeur max pour un int
        long aLong = 9223372036854775807L; // Valeur max pour un long
        float aFloat = 3.14f;           // Nombre décimal flottant 32 bits
        double aDouble = 3.14159265359; // Nombre décimal flottant 64 bits
        char aChar = 'A';               // Un seul caractère
        boolean aBoolean = true;        // Vrai ou faux

        // Déclaration de types de référence
        String aString = "Hello, World!";  // Chaîne de caractères
        int[] anArray = {1, 2, 3};         // Tableau d'entiers
        Object anObject = new Object();   // Un objet générique
        Integer anIntegerObject = 42;     // Wrapper pour un type primitif
        Exo1 instanceReference = new Exo1(); // Référence à une instance de la classe actuelle

        // Une variable de référence peut aussi être initialisée à null
        Object nullReference = null;

    }

}
