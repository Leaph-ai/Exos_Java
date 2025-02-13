public abstract class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }


    public void mange() {
        System.out.println(nom + " mange.");
    }
    public abstract void seDeplacer();
}