
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        SuivreOrdonnance jeanDupont = new Patient( "Dupon","Jean", new Date(3,7,1986));
PrescrireOrdonnance drLaRoche = new Medecin("LaRoche ", "Guillaume ", new Date(13,3,1970));
Traitement traitement1= new Traitement("vaccination ", true, 1);
Traitement traitement2= new Traitement("antibiotic ", false, 15);
Ordonnance ordonnance1 = new Ordonnance(new Date(15,5,2020), drLaRoche, traitement1, jeanDupont);
Ordonnance ordonnance2 = new Ordonnance(new Date(20,9,2020), drLaRoche, traitement2, jeanDupont);

        System.out.println(ordonnance1);
        System.out.println(ordonnance2);
        
        ArrayList<Patient> patients= new ArrayList<>();
        patients.add(new Patient("Dupont ", "Jean ", new Date(3,7,1986)));
        patients.add(new Patient("Vauclair  ", "Marie  ", new Date(25,10,1987)));
        patients.add(new Patient("Fontain  ", "Suzanne ", new Date(10,3,1985)));
        System.out.println(patients);
        
       final Date hier = new Date(12, 6, 2018) ; 
final Date aujourdhui = new Date(13,6, 2018) ; 
TreeSet<Ordonnance> ensembleOrdonnances = new TreeSet<Ordonnance>() ; 
final Ordonnance o1 = drLaRoche.prescrire(hier, traitement1, jeanDupont) ; 
final Ordonnance o2 = drLaRoche.prescrire(aujourdhui, traitement1, jeanDupont) ; 
final Ordonnance o3 = drLaRoche.prescrire(hier, traitement2, jeanDupont) ; 
ensembleOrdonnances.add(o1) ; 
ensembleOrdonnances.add(o2) ; 
ensembleOrdonnances.add(o3) ; 
System.out.println(ensembleOrdonnances.size()) ; 
System.out.println(ensembleOrdonnances) ;
    }
}