public interface SuivreOrdonnance {
  public void seTraiter(Ordonnance o) ;
  public void seFaireTraiter(Ordonnance o, EffectuerTraitement assistant) ;
  public void arreter(Ordonnance o) ;
}
