public class Exo2 {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("Tesla Model S", "Rouge", 79999.99);

        voiture1.afficherDetails();

        voiture1.setCouleur("Noir");
        voiture1.setPrix(-85999.99);
        

        
        voiture1.afficherDetails();
    }
}