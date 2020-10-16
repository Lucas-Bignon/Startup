package co.simplon;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    static void voituro(Agence agence){
        Transport Lucas = new Transport("issou","nami");
        System.out.println(Lucas.toString());
        agence.ajouter(Lucas);
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Agence agenceRennes = new Agence("Renne");
        System.out.println("Hello World!");
        voituro();
    }
}