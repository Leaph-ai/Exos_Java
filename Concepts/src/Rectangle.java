public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerSurface() {
        return largeur * hauteur; 
    }
}