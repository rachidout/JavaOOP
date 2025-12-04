package Banque;

public class Client {
    private String code ;
    private String nom ;
    private String prenom ;
    private String adresse ;
    private Agence monAgence;
    private Compte mesComptes[] ;
    private int NbrdesCompte;
    private static int NbrdesClient = 0;
    public Client(String nom , String prenom , String adresse , Agence agence ){
            NbrdesClient++;
        this.code = this.getClass().getName() +":"+ NbrdesClient;
        this.nom = nom;
        this.prenom = prenom ;
        this.adresse = adresse ;
    
    }
    
    public Compte getCompte(int n){
        if(n > NbrdesCompte){
            System.out.println("vous avez pas ce nombres des comptes !");
            return null;
        }
        return this.mesComptes[n];
    }
    public void addCompte(Compte compte){
        this.mesComptes[NbrdesCompte++]= compte;
    }
    public void deposer(int compte , double amount ){
        this.mesComptes[compte].deposer(amount);
    }
    public void retirer(int compte , double amount){
        this.mesComptes[compte].retirer(amount);
    }
    public int getNbrComptes(){
        return this.NbrdesCompte;
    }
    public String getCode(){
        return this.code;
    }
    }
