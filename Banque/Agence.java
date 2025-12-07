package Banque;

public class Agence {
  private String numero;
  private String adresse;
  private Client lesClients[];
  private Compte lesComptes[];
  private static int CompteurAgence = 0;
  private static int CompteurClients = 0;
  private static int CompteurCompte = 0;

  public Agence(String adresse) {
    CompteurAgence++;
    this.numero = this.getClass().getName() + ":" + CompteurAgence;
    this.adresse = adresse;
    this.lesClients = new Client[10];
    this.lesComptes = new Compte[100];
  }

  public String getNumero() {
    return this.numero;
  }

  public Compte getCompte(int n) {
    return this.lesComptes[n];
  }

  public Client getClient(int n) {
    return this.lesClients[n];
  }

  public void addClient(Client client) {
    lesClients[CompteurClients++] = client;
    for (int i = 0; i <= (client.getNbrComptes() - 1); i++) {
      if (client.getCompte(i) instanceof CompteEpargne || client.getCompte(i) instanceof ComptePayant)
        addCompte(client.getCompte(i));
    }
  }

  public void addCompte(Compte compte) {
    this.lesComptes[CompteurCompte++] = compte;
  }

  public int getNbClients() {
    return CompteurClients;
  }

  public int getNbComptes() {
    return CompteurCompte;
  }

  public void Clientbysolde() {
    Client[] ClientsTrie = new Client[getNbClients()];
    Client tmp = new Client();
    for (int i = 0; i < getNbClients(); i++) {
      ClientsTrie[i] = this.getClient(i);
    }
    for (int i = 0; i < getNbClients(); i++) {
      for (int j = i + 1; j < getNbClients(); j++) {
        if (this.getClient(i).getSoldeTotale() < this.getClient(j).getSoldeTotale()) {
          tmp = ClientsTrie[i];
          ClientsTrie[i] = ClientsTrie[j];
          ClientsTrie[j] = tmp;
        }
      }
    }
    for (int i = 0; i < this.getNbClients(); i++) {
      System.out
          .println("le Client " + ClientsTrie[i].getName() + " dont le solde est " + ClientsTrie[i].getSoldeTotale());
    }
  }

  @Override
  public String toString() {
    String clients = "";
    for (int i = 0; i < CompteurClients; i++) {
      clients += "\n " + lesClients[i].toString();
    }
    return "Agence {"
        + "\n numero = " + this.numero
        + "\n adresse =" + this.adresse
        + "\n les Clients = " + clients
        + " }";
  }
}