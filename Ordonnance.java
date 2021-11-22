


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ordonnance implements Comparable<Object>{
    private Date dateOrdonnance;
    private PrescrireOrdonnance prescripteur;
    private Traitement traitement;
    private SuivreOrdonnance receveur;
    private int nonmbreSeanceRestants;

    public Date getDateOrdonnance() {
        return dateOrdonnance;
    }

    public PrescrireOrdonnance getPrescripteur() {
        return prescripteur;
    }

    public Traitement getTraitement() {
        return traitement;
    }

    public SuivreOrdonnance getReceveur() {
        return receveur;
    }

    public int getNonmbreSeanceRestants() {
        return nonmbreSeanceRestants;
    }

    public Ordonnance(Date dateOrdonnance, PrescrireOrdonnance prescripteur, Traitement traitement, SuivreOrdonnance receveur) {
        this.dateOrdonnance = dateOrdonnance;
        this.prescripteur = prescripteur;
        this.traitement = traitement;
        this.receveur = receveur;
        this.nonmbreSeanceRestants = traitement.getNombreDeSeances();
    }
   public void baisseNombreSeances(){
   if(nonmbreSeanceRestants>0)
       nonmbreSeanceRestants--;
   }

    @Override
    public String toString() {
        return "Arrangement{" + "Date=" + dateOrdonnance +
                ", Prescriber=" + prescripteur + ", "
                + "Processing=" + traitement + ""
                + ", Recipient=" + receveur + ", "
                + "Number of remaining sessions=" + nonmbreSeanceRestants + '}';
    }

    @Override
    public int compareTo(Object o) {
      return dateOrdonnance.compareTo(((Ordonnance)o).dateOrdonnance);
      
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordonnance other = (Ordonnance) obj;
        return dateOrdonnance.equals(other.getDateOrdonnance());
       }
}