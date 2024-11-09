public class Client {

    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

/**
 * 
 * @param nom = nom
 * @param ville = ville
 * @param comptePrive = comptePrive
 * @param compteEpargne = compteEpargne
 * 
 * La creation des constructeurs
 */
    public Client(String nom, String ville, Compte comptePrive, Compte compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

/**
 * La méthode pour afficher les informations du client
 */
    public void afficherInfos() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println(" Compte privé: " + comptePrive);
        System.out.println(" Compte d'épargne: " + compteEpargne);
    }

/**
 * La méthode pour appliquer les intérêts aux comptes
 */
    public void bouclerComptes() {
        comptePrive.bouclerCompte();
        compteEpargne.bouclerCompte();
    }
}