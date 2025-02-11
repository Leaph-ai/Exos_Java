class Livre{
    private String titre;

    public Livre(String titre){
        this.titre = titre;
    }

    public String getLivre(){
        return this.titre;
    }

    public void setLivre(String name){
        this.titre = name;
    }
}

public class Exo1 {
    public static void main(String[] args) throws Exception {
        Livre livre = new Livre("Super Livre trop cool");

        System.out.println(livre.getLivre());

        livre.setLivre("Super Livre trop cool 2");

        System.out.println(livre.getLivre());
    }
}