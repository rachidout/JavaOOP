import java.util.*;
import Banque.*;

public class ApplicationBancaire {
  
      public static void main(String args[]){
     Agence agence1 = new Agence("Agadir Hay Salam");
     Client[] client = new Client[4];
     client[0] = new Client("rachid", "outsila", "Dakhla ", agence1);
     client[1] = new Client("fatima", "blilid", "Salam", agence1);
     client[2] = new Client("Abderahim", "outsila", "tikiouin", agence1);
     client[3] = new Client("zakaria","outsila","salam",agence1);
     CompteEpargne compte1 = new CompteEpargne(1000,client[0]);
     compte1.setTaux(1.5);
     client[0].addCompte(compte1);
     ComptePayant compte2 = new ComptePayant(2500,client[1]);
     client[1].addCompte(compte2);
     ComptePayant compte3 = new ComptePayant(0,client[2]);
     ComptePayant compte4 = new ComptePayant(3000,client[2]);
     client[2].addCompte(compte4);
     client[2].addCompte(compte3);
     ComptePayant compte5 = new ComptePayant(1000,client[3]);
     CompteEpargne compte6 = new CompteEpargne(2300,client[3]);
     compte6.setTaux(2);
     client[3].addCompte(compte5);
     client[3].addCompte(compte6);
     agence1.addClient(client[0]);
      System.out.println(agence1.toString());
      }
   

}
