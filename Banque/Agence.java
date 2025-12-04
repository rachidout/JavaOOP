package Banque;

 public class Agence{
    private String numero ;
    private String adresse ;
    private Client lesClients[] ;
    private Compte lesComptes[] ;
    private static int CompteurAgence = 0 ;
    private  int CompteurClients =0 ;
    private int CompteurCompte = 0 ;
    
    public Agence( String adresse ){
                  CompteurAgence++;
            this.numero = this.getClass().getName()+":"+CompteurAgence ;
            this.adresse = adresse;

    }
    public Compte getCompte(int n){
      return this.lesComptes[n];
    }
    public Client getClient(int n){
      return this.lesClients[n] ;
    }
    public void addClient( Client client){
      lesClients[CompteurClients++] = client;
      
      System.out.println("Le client est ajouter !");
    }
    public void addCompte(Compte compte){
      this.lesComptes[CompteurCompte++] = compte;
      System.out.println("Le Compte est ajouter !");
    }
    
    public int getNbClients(){
      return lesClients.length;
    }
    public int getNbComptes(){
      return lesComptes.length;
    }
 }    