public class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " vole dans les airs.");
    }

    public void voler() {
        System.out.println(nom + " plane.");
    }
}