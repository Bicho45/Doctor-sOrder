public class Traitement {
    private String name;
    private boolean necessiteSuivi ;
    private int nombreDeSeances;

    public Traitement(String name, boolean necessiteSuivi, int nombreDeSeances) {
        this.name = name;
        this.necessiteSuivi = necessiteSuivi;
        this.nombreDeSeances = nombreDeSeances;
    }

    public String getNom() {
        return name;
    }

    public boolean isNecessiteSuivi() {
        return necessiteSuivi;
    }

    public int getNombreDeSeances() {
        return nombreDeSeances;
    }

    @Override
    public String toString() {
        return name + 
                 ", " + nombreDeSeances +" session(s) perform)"+
                " " + (necessiteSuivi?", To perform with the assistance of an Agree Assistant.":"" );
    }
}