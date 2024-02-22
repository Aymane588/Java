import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmployes {
    private List<Employee> employees;

    public GestionnaireEmployes() {
        this.employees = new ArrayList<>();
    }

    public void ajouterEmploye(Employee employe) {
        employees.add(employe);
    }

    public void supprimerEmploye(Employee employe) {
        employees.remove(employe);
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employee employe : employees) {
            System.out.println(employe);
        }
    }

    public void supprimerEmploye(String nom, String prenom) {
        Iterator<Employe> iterator = listeEmployes.iterator();
        while (iterator.hasNext()) {
            Employe employe = iterator.next();
            if (employe.getNom().equals(nom) && employe.getPrenom().equals(prenom)) {
                iterator.remove();
                System.out.println("Employe avec le nom " + nom + " et le prenom " + prenom + " supprime.");
                return;
            }
        }
    }
}

    public void supprimerEmploye(Employee employe) {
        employees.remove(employe);
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employee employe : employees) {
            System.out.println(employe);
        }
    }
}
