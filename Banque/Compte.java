package Banque;

public class Compte {
     
     private String code ;
     protected double solde ;
     protected Agence LAgence ;
     protected Client  proprietaire ;
     private static int NbrdesCompte = 0;
     public Compte(){}
     public Compte(double solde ,Client proprietaire ){
      NbrdesCompte++;
      this.code = this.getClass().getName()+":"+NbrdesCompte; 
      this.solde = solde;
      this.proprietaire =proprietaire;
     }
     public String getCode(){
        return this.code;
     }
     public void setCode(String code){
        this.code = code ;
     }
     public void deposer(double amount){
         this.solde += amount ;
     }
     public void retirer(double amount ){
      if(amount > this.solde){
         System.out.println("vous avez pas Cette somme !");
         return ;
      }
        this.solde -= amount;
     }
     
}
