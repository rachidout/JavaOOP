package Banque;

public class CompteEpargne extends Compte{
    private double taux ;

    public double getTaux(){
       return this.taux;
    }
    public void setTaux(double taux){
        this.taux = taux ;
    }
    public void calculInteret(){
        this.solde += (solde*this.taux)%100;
    }
}
