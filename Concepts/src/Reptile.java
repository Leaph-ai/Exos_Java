public class Reptile extends Animal {

    public Reptile(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " rampe sur le sol.");
    }

    public void ramper() {
        System.out.println(nom + " rampe en bien le frère.");
    }
}