package co.simplon;

public class Transport{
    private String nom;
    private String couleur;

    public Transport(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public String toString(){
        String str= "Voiture " + this.nom +" et sa plaque d'imatriculation " + this.couleur;
        return str;
    }

    // public void setNom(String Nouveau_nom){
    //     this.nom = nom;
    // }
}
