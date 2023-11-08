import java.util.Objects;

public class Voiture {
    private int immariculation;

    private String marque;
    private float prixLocation;

    ListVoitures lv =new ListVoitures();


    public Voiture(int immariculation, String marque, float prixLocation) {
        // à compléter
    }
    public int getImmariculation() {

        return immariculation;
    }
    public void setImmariculation(int immariculation) { this.immariculation
            = immariculation;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {

        this.marque = marque;
    }
    public float getPrixLocation() {
        return prixLocation;
    }
    public void setPrixLocation(float prixLocation)
    { this.prixLocation =
            prixLocation;
    }
    public int hashCode() {
        return Objects.hash(immariculation, marque, prixLocation);
    }

    public boolean
    equals(Object obj) {
        if (obj==this) return true;
        if (obj==null) return false ;
        if (obj.getClass()!=this.getClass())return false;

        Voiture v1 =(Voiture) obj;
        if (v1.immariculation==immariculation)return true;
        else
            return false ;
    }
    public String toString() {
        return ("immariculation" + immariculation + "marque : " + marque + "prix de location : " +prixLocation);

    }
//à completer
}
