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
            this.lesClients = new Client[10];
            this.lesComptes = new Compte[100];
    }
    public String getNumero(){
      return this.numero;
    }
    public Compte getCompte(int n){
      return this.lesComptes[n];
    }
    public Client getClient(int n){
      return this.lesClients[n] ;
    }
    public void addClient( Client client){
      lesClients[CompteurClients++] = client;
    }
    public void addCompte(Compte compte){
      this.lesComptes[CompteurCompte++] = compte;
    }
    
    public int getNbClients(){
      return CompteurClients;
    }
    public int getNbComptes(){
      return CompteurCompte;
    }
    @Override
    public String toString(){
      String clients="";
      for (int i = 0; i < CompteurClients ; i++) {
        clients ="\n "+lesClients[i].toString();
      }
      return "Agence {"
      +"\n numero = "+this.numero
      +"\n adresse ="+this.adresse
      +"\n les Clients = "+clients
      +" }"
;
    }
 }    