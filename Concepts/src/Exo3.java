import java.util.ArrayList;

public class Exo3 {
    public static void main(String[] args) {
        Employe enseignant = new Enseignant();
        Employe directeur = new Directeur();
        Employe admin = new PersonnelAdministratif();

        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(enseignant);
        employes.add(directeur);
        employes.add(admin);

        for (Employe emp : employes) {
            emp.travailler();
        }
    }
}