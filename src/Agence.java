import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client,ListVoitures> clientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        this.vs = new ListVoitures();
        this.clientVoitureLoue = new HashMap<>();
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
    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        //  search if client exist in ClientVoitureLoue
        if (clientVoitureLoue.containsKey(cl)) {
            ListVoitures listClient = clientVoitureLoue.get(cl);
            listClient.ajoutVoiture(v);
            this.vs.supprimeVoiture(v);
            this.clientVoitureLoue.put(cl, listClient);
        } else {
            ListVoitures list = new ListVoitures();
            vs.ajoutVoiture(v);
            this.vs.supprimeVoiture(v);
            this.clientVoitureLoue.put(cl, list);
        }
    }
    public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
// à completer
    }
    public List<Voiture> selectVoitureSelonCritere(Critere c){

    }

    public Set<Client> ensembleClientsLoueurs() {
        return clientVoitureLoue.keySet();
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        return clientVoitureLoue.values();
    }
    public void afficheLesClientsEtLeursListesVoitures() {
        for (Map.Entry<Client, ListVoitures> entry : clientVoitureLoue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public Map<Client, ListVoitures> triCodeCroissant() {
        Map<Client, ListVoitures> mapTrie = new TreeMap<>((c1, c2) -> c1.getCode()-c2.getCode());
        mapTrie.putAll(clientVoitureLoue);
        return mapTrie;
    }
    public Map<Client, ListVoitures> triNomCroissant() {
        Map<Client, ListVoitures> mapTrie = new TreeMap<>(new TrieNomCroissant());
        mapTrie.putAll(clientVoitureLoue);
        return mapTrie;

    }


    }

}