package Vehicule;

public abstract class Vehicule implements Motorisation {
    private String matricule;
    private String modele;
    private int prix;
    private double capacity;
    private Carburant carburant;

    public Vehicule(String modele, String type, int prix, Carburant carburant) {
        this.modele = modele;
        this.prix = prix;
        this.carburant = carburant;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

}