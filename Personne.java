public class Personne {
    protected String name,firstName;
    protected  Date dateNaissance;

    public Personne(String name, String firstName, Date dateNaissance) {
        this.name = name;
        this.firstName = firstName;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return name;
    }

    public String getPrenom() {
        return firstName;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public String toString() {
        return "("  + firstName + " " + name + "," + dateNaissance + ")";
    }   
}