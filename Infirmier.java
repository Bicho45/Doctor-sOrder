import java.util.HashSet;

public class Infirmier extends Personne implements EffectuerTraitement{
private HashSet<Ordonnance> ordonnancesSuivis;
    public Infirmier(String nom, String prenom, Date dateNaissance) {
        super(nom, prenom, dateNaissance);
        ordonnancesSuivis= new HashSet<Ordonnance>();
    }

    public HashSet<Ordonnance> getOrdonnancesSuivis() {
        return ordonnancesSuivis;
    }

    @Override
    public void effectuerSeance(Ordonnance o) {
       if(ordonnancesSuivis.contains(o))  
       { for(Ordonnance or:ordonnancesSuivis)
       {
           if(or.equals(o))
           {
               o.baisseNombreSeances();
               if( o.getNonmbreSeanceRestants()==0)
                  o.getPrescripteur().arreter(o);
           }
       }
    }else
           System.out.println("You don't have to follow this order.");
    }

    public void suivreOrdonnance(Ordonnance o){
    ordonnancesSuivis.add(o);
    }
    
    public void emleverOrdonnance(Ordonnance o)
    {
    ordonnancesSuivis.remove(o);
    }
}