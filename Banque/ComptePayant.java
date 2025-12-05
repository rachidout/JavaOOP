package Banque;

public class ComptePayant extends Compte{
       private final double taux_operation = 5 ;
       
       public ComptePayant(int amount){
            super(amount);
       }
       @Override 
       public void deposer(double amount){
             solde += (amount-taux_operation);
       }
       @Override
       public void retirer(double amount){
        if(this.solde < amount ){
         System.out.println("vous avez pas Cette somme !");
         return ;
        }
        solde -= (amount + taux_operation );
       }
       @Override
      public String toString(){
      return "Compte Eparge {"
      +"\n solde = "+this.solde
      +"\n taux_Operation = "+this.taux_operation
      +"\n Proprietaire = "+this.proprietaire.toString()
      +"}";
     }
}
