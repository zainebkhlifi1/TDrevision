// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture(1, "RENAUT", 30.00f);
        Voiture v4 = new Voiture(1, "RENAUT", 30.00f);

        Voiture v2 = new Voiture(2, "BMW", 25.00f);
        Voiture v3 = new Voiture(3, "AUDI", 26.00f);
        Client c1 = new Client(1, "feres", "ben aissa");
        Client c2 = new Client(2, "Mezen", "boulares");
        try {
            ListVoitures lv = new ListVoitures();

            Agence g=new Agence("hhh");
            g.ajoutVoiture(v1);
            g.ajoutVoiture(v2);
            g.ajoutVoiture(v3);
            g.loueClientVoiture(c1,v2);
            g.loueClientVoiture(c2,v1);

        } catch (VoitureException e) {
            System.out.println("dddd");
        }


    }
}