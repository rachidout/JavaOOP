package PME;

public class Empfixe extends Employe {
    private double SalaireParSemaire;

    public Empfixe(String nom, String Adresse) {
        super(nom, Adresse);
    }

    public Empfixe(String nom, String Adresse, double SalaireParSemaire) {
        super(nom, Adresse);
        this.SalaireParSemaire = SalaireParSemaire;
    }

    @Override
    public void setSalaire(double SalaireParSemaire) {
        this.SalaireParSemaire = SalaireParSemaire;
    }
}