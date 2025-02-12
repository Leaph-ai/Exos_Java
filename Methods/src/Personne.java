public class Personne {
    private String nom;
    protected int age;
    String adresse;

    public void afficherNom() {
        System.out.println("Nom : " + nom);
    }

    private void changerNom(String nom) {
        this.nom = nom;
    }

    protected void afficherAge() {
        System.out.println("Âge : " + age);
    }

    void afficherAdresse() {
        System.out.println("Adresse : " + adresse);
    }

    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }
}