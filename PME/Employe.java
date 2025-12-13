package PME;

public class Employe {
    private String Matricule;
    private String nom;
    private String Adresse;
    private double salaire;
    private static int compteur = 0;

    public Employe() {
    }

    public Employe(String nom, String Adresse) {
        compteur++;
        this.Matricule = this.getClass().getName() + ":" + compteur;
        this.nom = nom;
        this.Adresse = Adresse;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return this.Adresse;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public String getMatricule() {
        return this.Matricule;
    }

}