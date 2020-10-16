package co.simplon;
import java.util.ArrayList;

public class agence {
    private String ville;
    ArrayList<Transport> stock;
    public agence(String ville){
        this.ville = ville;
        this.stock = new ArrayList<Transport>();
    }
    void ajouter(Transport transport){
        this.stock.add(transport);
    }
    String getChaine(){
        return "ma ville"+this.ville;
    }
    void afficherStock(){
        for(Transport voiture : stock){
            System.out.println(voiture.getchaine());
        }

    }
}
