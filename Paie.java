import PME.*;

public class Paie {
    void SalaireHebdomadaire(Employe[] emp) {
        double SommeDesSalaire;
        for (int i = 0; i < emp.length; i++) {

        }
    }

    public static void main(String args[]) {
        Employe[] employes = new Employe[6];

        employes[0] = new EmpHoraire("Rachid", "Aourir", 32, 30);
        employes[1] = new EmpHoraire("Khalid", "tamraght", 20, 20);
        employes[2] = new EmpJour("Yassin", "Salam", 5, 200);
        employes[3] = new EmpJour("Youssef", "Inzgan", 6, 50);
        employes[4] = new Empfixe("mohamed", "dakhla");
        employes[4].setSalaire(2000);
        employes[5] = new Empfixe("zakaria", "casa", 2300);

        System.out.println(employes.length);
    }
}

// setsalaire salaire = 100dh
// getsalaire
