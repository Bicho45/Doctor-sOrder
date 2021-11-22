import java.util.HashSet;

public class Medecin extends Personne implements PrescrireOrdonnance {
    private HashSet<Ordonnance> ordonnances;

    public Medecin(String nom, String prenom, Date dateNaissance) {
        super(nom, prenom, dateNaissance);
        ordonnances= new HashSet<Ordonnance>();
    }

    public HashSet<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void  arreter(Ordonnance o){
    SuivreOrdonnance receveur=o.getReceveur();
    receveur.arreter(o);
    }

    @Override
    public Ordonnance prescrire(Date d, Traitement t, SuivreOrdonnance p) {
      Ordonnance o=  new Ordonnance(d, this, t, p);
    ordonnances.add(o);
    ((Patient)p).ajouterOrdonnance(o);
    return o; 
    }
}