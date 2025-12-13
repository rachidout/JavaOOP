package PME;

public class EmpHoraire extends Employe {
    private int NbrHours;
    private double salaireParHour;

    public EmpHoraire(String nom, String Adresse) {
        super(nom, Adresse);
    }

    public EmpHoraire(String nom, String Adresse, int NbrHours, int salaireParHour) {
        super(nom, Adresse);
        this.NbrHours = NbrHours;
        this.salaireParHour = salaireParHour;
    }

    @Override
    public void setSalaire(double salaireParHour) {
        this.salaireParHour = salaireParHour;
    }

    public void setNbrHours(int NbrHours) {
        this.NbrHours = NbrHours;
    }
}