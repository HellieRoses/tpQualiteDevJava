package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * créer les commandes correspondant à ce que l'utilisateur ecrit
     * @param name nom de la commande à créer
     * @param document le document à changer
     * @param parameters tous les parametres correspondants aux commande
     * @return Commande {@link Commande}*/

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscule(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document,parameters);
            case "inserer" : return new CommandeInsert(document,parameters);
            default: return null;
        }
    }

}
