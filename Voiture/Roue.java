package Voiture;

public class Roue {
    private int largeur ;
    private int diametreJante;

    public Roue(){
        this.diametreJante = 0 ;
        this.largeur = 0;
    }
    public Roue(int largeur , int diametreJante){
        this.largeur = largeur ;
        this.diametreJante = diametreJante;
    }
    public int getLargeur(){
        return this.largeur;
    }
    public int getdiametre(){
        return this.diametreJante;
    }
    public String toString(){
        return "{diametre = "+this.diametreJante +", largeur = "+ this.largeur+"}";
    }
}
