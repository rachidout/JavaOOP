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

     @Override
    public String toString(){
      return "Compte Eparge {"
      +"\n solde = "+this.solde
      +"\n taux = "+this.taux
      +"\n Proprietaire = "+this.proprietaire.toString()
      +"}";
     }
}
