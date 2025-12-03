package Voiture;

public class Voiture {
    private String modele ;
    private String marque ;
    private double vitesse ;
    private double vitesseMax;
    private boolean estDemarree;
    private Roue RoueDesecoure;
    
    private Roue[] LesRoue ;
    private Moteur moteur;
   
    public Voiture(String modele , String marque , double vitesseMax , Roue[] Les4Roue , String nom , int puissance ){
         this.modele = modele ;
         this.marque = marque ;
         this.vitesse = 0;
         this.vitesseMax = vitesseMax;
         if( Les4Roue.length == 4 ){
         this.LesRoue = Les4Roue;
         }
         else{
            System.out.println("il faut $ Roues");
         }
         this.moteur = new Moteur(nom,puissance,this);
    }

    public int deQuellePuissance(){
        return moteur.getPuissance();
    }

    public void demarre(){
        this.moteur.mouterAlummer();
        this.estDemarree = true;
        System.out.println("la voiture est Demarre ");
    }
    public void accelere(double V){
        if(!estDemarree){
            System.out.println("la voiture nest pas demaree");
        }else{
        if((this.vitesse + V ) >= this.vitesseMax ){
         this.vitesse = vitesseMax;
        }
        else{
            this.vitesse += V ;
        }
        System.out.println("la vitesse est "+this.vitesse);
    }
    }
    public String toString(){
        return "Voiture { modele = "+ this.modele +"marque ="+this.marque +"vitesse" +this.vitesse+"vitesseMAx="+this.vitesseMax + moteur.toString();
    }
    public void changerMoteur(Moteur moteur){
        this.moteur = moteur;
    }
    public void AficherAlert(String alert){
        System.out.println(alert);
    }
    public void mouterestchaffe(){
        if(vitesse > 250){
            this.moteur.chauffe();
        }
        else{
            System.out.println("nest pas chauffe");
        }
    }
    
}

