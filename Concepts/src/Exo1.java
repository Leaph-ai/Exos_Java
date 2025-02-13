public class Exo1 {
    public static void main(String[] args) {
        Mammifere lion = new Mammifere("Lion");
        lion.mange();
        lion.seDeplacer();
        lion.marcher();

        Oiseau aigle = new Oiseau("Aigle");
        aigle.mange();
        aigle.seDeplacer();
        aigle.voler();

        Reptile serpent = new Reptile("Serpent");
        serpent.mange();
        serpent.seDeplacer();
        serpent.ramper();
    }
}