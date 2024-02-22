import java.util.Date;

class ModélisationEmployés {
    public class Employe {

        private String nom;
        private String prenom;
        private double salaire;
        private Date dateEmbauche;
        private String role;
        private double tauxDeTravail;
        private double heureDeTravail;
        private double bonus;

        public Employe(String nom, String prenom, double salaire, Date dateEmbauche, String role, double tauxDeTravail, double heureDeTravail, double bonus ) {
            this.nom = nom;
            this.prenom = prenom;
            this.salaire = salaire;
            this.dateEmbauche = dateEmbauche;
            this.role = role;
            this.tauxDeTravail = tauxDeTravail;
            this.heureDeTravail = heureDeTravail;
            this.bonus = bonus;
        }

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public String getPrenom() {
            return prenom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
        public double getSalaire() {
            return salaire;
        }
        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }
        public Date getDateEmbauche() {
            return dateEmbauche;
        }
        public void setDateEmbauche(Date dateEmbauche) {
            this.dateEmbauche = dateEmbauche;
        }

        public double calculerSalaire() {
            double salaireDeBase = tauxDeTravail * heureDeTravail;
            double totalSalaire = salaireDeBase + bonus;
            return totalSalaire;
        }

        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public double getTauxdetravail() {
            return tauxDeTravail;
        }
        public void setTauxdetravail(double tauxDeTravail) {
            this.tauxDeTravail = tauxDeTravail;
        }
        public double getHeureDeTravail() {
            return heureDeTravail;
        }
        public void setHeureDeTravail(double heureDeTravail) {
            this.heureDeTravail = heureDeTravail;
        }
        public double getBonus() {
            return bonus;
        }
        public void Bonus(double bonus) {
            this.bonus = bonus;
        }
        public void afficherDetails() {
            System.out.println("Nom: " + nom);
            System.out.println("Prénom: " + prenom);
            System.out.println("Salaire: " + salaire);
            System.out.println("Role: " + role);
            System.out.println("TauxDeTravail: " + tauxDeTravail);
            System.out.println("HeureDeTravail: " + heureDeTravail);
            System.out.println("Bonus: " + bonus);
        }

        public void augmenterSalaire(double pourcentage) {
            salaire *= (1 + pourcentage / 100);
        }
    }
}