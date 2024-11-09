public class Compte {
    private double solde;
    private double tauxInteret;

/**
 * 
 * @param solde = solde
 * @param tauxInteret = tauxInternet 
 * La création des constructeurs
 */
    public Compte(double solde, double tauxInteret) {
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

/**
 * La méthode pour appliquer l'intérêt
 */
    public void bouclerCompte() {
        solde += solde * tauxInteret;
    }

/**
 * 
 * @return solde
 * Le getter pour le solde
 */
    public double getSolde() {
        return solde;
    }
    
/**
 * La méthode pour afficher le solde
 */
    public String toString() {
        return "Solde: " + solde + " francs";
    }

}