import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client,ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        this.vs = new ListVoitures();
        this.ClientVoitureLoue = new HashMap<>();
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (v == null) {
            throw new VoitureException("pas de voiture");
        }
        vs.ajoutVoiture(v);
    }

    public void suppVoiture(Voiture v) throws VoitureException {
        if (v == null) {
            throw new VoitureException("pas de voiture");
        }
        vs.supprimeVoiture(v);
    }
    public void loueClientVoiture(Client cl, Voiture v)throws  VoitureException{

    }
    public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
// à completer
    }
    public List<Voiture> selectVoitureSelonCritere(Critere c){
//à completer
    }

    public Set<Client> ensembleClientsLoueurs() {
        return ClientVoitureLoue.keySet();
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        return ClientVoitureLoue.values();
    }
    public void afficheLesClientsEtLeursListesVoitures() {
        for (Map.Entry<Client, ListVoitures> entry : ClientVoitureLoue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public Map<Client, ListVoitures> triCodeCroissant() {
        Map<Client, ListVoitures> mapTrie = new TreeMap<>((c1, c2) -> c1.getCode().compareTo(c2.getCode()));
        mapTrie.putAll(ClientVoitureLoue);
        return mapTrie;
    }
    public Map<Client, ListVoitures> triNomCroissant() {
        Map<Client, ListVoitures> mapTrie = new TreeMap<>((c1, c2) -> c1.getNom().compareTo(c2.getNom()));
        mapTrie.putAll(ClientVoitureLoue);
        return mapTrie;
    }

}