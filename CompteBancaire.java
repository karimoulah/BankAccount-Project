class CompteBancaire { 
    private double solde; 
    private String titulaire; 
    
    //Constructeur
    public CompteBancaire(String titulaire, double soldeInitial) { 
        this.titulaire = titulaire; 
        this.solde = soldeInitial; 
    } 
     // Méthode pour déposer de l'argent 
     public void deposer(double montant) { 
         if (montant > 0) { 
            solde += montant;
            System.out.println(montant + " EUR déposés sur le compte de " + titulaire);
         } else { 
            System.out.println("Le montant doit être positif.");
        } 
    } 
     // Méthode pour retirer de l'argent 
      public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant; 
            System.out.println(montant + " EUR retirés du compte de " + titulaire);
        } else {
            System.out.println("Retrait impossible : solde insuffisant ou montant incorrect.");
        }
    }
     // Méthode pour afficher le solde 
     public void afficherSolde() {
         System.out.println("Le solde du compte de " + titulaire + " est de " + solde + " EUR.");
        }
    
    public class Main {
        public static void main(String[] args) {
            CompteBancaire compte = new CompteBancaire("Alice", 1000.0);
            compte.afficherSolde();
            compte.deposer(200);
            compte.retirer(150);
            compte.afficherSolde();
            compte.retirer(2000); // Cas de retrait impossible
            }
        }
}    