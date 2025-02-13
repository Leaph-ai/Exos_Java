public class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " marche sur 4 ou 2 pattes.");
    }

    public void marcher() {
        System.out.println(nom + " marche dignement.");
    }
}