package PME;

public class EmpJour extends Employe {
    private int Nbrjours;
    private double salaireParJour;

    public EmpJour(String nom, String Adresse) {
        super(nom, Adresse);
    }

    public EmpJour(String nom, String Adresse, int Nbrjours, double salaireParJour) {
        super(nom, Adresse);
        this.Nbrjours = Nbrjours;
        this.salaireParJour = salaireParJour;
    }

    @Override
    public void setSalaire(double salaireParJour) {
        this.salaireParJour = salaireParJour;
    }

    public void setNbrJours(int Nbrjours) {
        this.Nbrjours = Nbrjours;
    }
}
