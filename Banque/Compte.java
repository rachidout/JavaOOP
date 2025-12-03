package Banque;

public class Compte {
     
     private String code ;
     protected double solde ;
     protected Agence LAgence ;
     protected Client  Aproprietaires ;
    
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
        this.solde -= amount;
     }
}
