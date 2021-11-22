public interface PrescrireOrdonnance {
    public Ordonnance prescrire(Date d, Traitement t, SuivreOrdonnance p) ;
    public void  arreter(Ordonnance o) ;
}
