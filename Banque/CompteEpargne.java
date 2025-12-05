package Banque;

public class CompteEpargne extends Compte{
    private double taux ;

    public CompteEpargne(int amount, Client proprietaire){
        super(amount,proprietaire);
    }
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
      +"\n code =" +this.getCode()
      +"\n solde = "+this.solde
      +"\n taux = "+this.taux
      +"\n Proprietaire = "+this.proprietaire.getCode()
      +"}";
     }
}
