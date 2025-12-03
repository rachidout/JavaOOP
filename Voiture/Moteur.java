package Voiture;

public class Moteur {
 private String nom ;
 private int puissance ;
 private Voiture voiture;
  
 public Moteur(){
    this.nom ="";
    this.puissance = 0;
 }
 public Moteur(String nom , int puissance , Voiture voiture){
      this.nom = nom;
      this.puissance = puissance;
      this.voiture = voiture;
 }
 public int getPuissance(){
    return this.puissance;
 }
 public String toString(){
    return "Mouteur {"+"nom :"+this.nom+" , puissance:"+this.puissance+  "}";
 }
 public void mouterAlummer(){
    System.err.println("le mouter est alumme");
 }
public void chauffe(){
    voiture.AficherAlert("LE moteur est chauffe !");
}
}
