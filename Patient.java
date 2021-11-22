import java.util.HashSet;

public class Patient extends Personne implements SuivreOrdonnance {
 private HashSet<Ordonnance> mesOrdonnances;
    public Patient(String nom, String prenom, Date dateNaissance) {
        super(nom, prenom, dateNaissance);
        mesOrdonnances= new HashSet<Ordonnance>();
       }

    public HashSet<Ordonnance> getMesOrdonnances() {
        return mesOrdonnances;
    }
    
    public void ajouterOrdonnance(Ordonnance o) {
    if(o!=null)
        mesOrdonnances.add(o);
    }

    @Override
    public void seTraiter(Ordonnance o) {
        if(mesOrdonnances.contains(o))
        if(!o.getTraitement().isNecessiteSuivi())
        {
            o.baisseNombreSeances();
           if( o.getNonmbreSeanceRestants()==0)
                  o.getPrescripteur().arreter(o);
        }
        else
        System.out.println("You cannot perform this process alone, please contact an authorized assistant.");
         else
            System.out.println("You don't have a prescription for this treatment.");
    }

    @Override
    public void seFaireTraiter(Ordonnance o, EffectuerTraitement assistant) {
        assistant.effectuerSeance(o);
    }

    @Override
    public void arreter(Ordonnance o) {
       mesOrdonnances.remove(o);
    }
}