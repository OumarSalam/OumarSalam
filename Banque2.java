public class Banque2 {
    public static void main(String[] args) {
/**
 * La création des comptes pour Pedro de Genève
 */
        Compte comptePrivePedro = new Compte(1000.0, 0.01);
        Compte compteEpargnePedro = new Compte(2000.0, 0.02);

/**
 * La création des comptes pour Alexandra de Lausanne 
 */
        Compte comptePriveAlexandra = new Compte(3000.0, 0.01);
        Compte compteEpargneAlexandra = new Compte(4000.0, 0.02);

/**
 * La création des clients Pedro de Genève et Alexendra de Lausanne 
 */
        Client pedro = new Client("Pedro", "Genève", comptePrivePedro, compteEpargnePedro);
        Client alexandra = new Client("Alexandra", "Lausanne", comptePriveAlexandra, compteEpargneAlexandra);

/**
 * La création de la banque et l'ajout des clients
 */
        Banque banque = new Banque();
        banque.ajouterClient(pedro);
        banque.ajouterClient(alexandra);

/**
 * L'affichage des soldes avant application des intérêts
 */
        System.out.println("Avant l'application des intérêts :");
        banque.afficherInfosClients();

/**
 * L'application des intérêts
 */
        banque.bouclerComptes();

/**
 * L'affichage des soldes après application des intérêts
 */
        System.out.println("Après l'application des intérêts :");
        banque.afficherInfosClients();
    }
}