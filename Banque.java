import java.util.ArrayList;

public class Banque {
    private ArrayList<Client> clients;

/**
 * La création du constructeurs
 */
    public Banque() {
        clients = new ArrayList<>();
    }

/**
 * 
 * @param client
 * La méthode pour ajouter un client
 */
    public void ajouterClient(Client client) {
        clients.add(client);
    }

/**
 * La méthode pour appliquer les intérêts à tous les clients
 */
    public void bouclerComptes() {
        for (Client client : clients) {
            client.bouclerComptes();
        }
    }

/**
 * La méthode pour afficher les informations de tous les clients
 */
    public void afficherInfosClients() {
        for (Client client : clients) {
            client.afficherInfos();
            System.out.println();
        }
    }
}