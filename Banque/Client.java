package Banque;

public class Client {
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence monAgence;
    private Compte mesComptes[];
    private int NbrdesCompte;
    private static int NbrdesClient = 0;

    public Client() {}

    public Client(String nom, String prenom, String adresse, Agence agence) {
        NbrdesClient++;
        this.code = this.getClass().getName() + ":" + NbrdesClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.monAgence = agence;
        mesComptes = new Compte[5];
    }

    public Compte getCompte(int n) {
        if (n > NbrdesCompte) {
            System.out.println("vous avez pas ce nombres des comptes !");
            return null;
        }
        return this.mesComptes[n];
    }

    public void addCompte(Compte compte) {
        this.mesComptes[NbrdesCompte++] = compte;
    }

    public void deposer(int compte, double amount) {
        this.mesComptes[compte - 1].deposer(amount);
    }

    public void retirer(int compte, double amount) {
        this.mesComptes[compte - 1].retirer(amount);
    }

    public int getNbrComptes() {
        return this.NbrdesCompte + 1;
    }

    public String getCode() {
        return this.code;
    }

    public double getSoldeTotale() {
        double somme = 0;
        for (int i = 0; i < this.getNbrComptes(); i++) {
            if (this.getCompte(i) instanceof CompteEpargne || this.getCompte(i) instanceof ComptePayant) {
                somme += this.getCompte(i).getSolde();
            }
        }
        return somme;
    }

    public String getName() {
        return this.nom + " " + this.prenom;
    }

    @Override
    public String toString() {
        String comptes = "";
        for (int i = 0; i < NbrdesCompte; i++) {
            comptes += "\n " + mesComptes[i].toString();
        }
        return "Client:{"
                + "\n code = " + this.code
                + "\n nom =" + this.nom
                + "\n prenom =" + this.prenom
                + "\n adresse =" + this.adresse
                + "\n Agence =" + this.monAgence.getNumero()
                + "\n mes comptes =>" + comptes
                + "}";
    }
}
