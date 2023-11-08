package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }


    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        int indiceDebut = Integer.parseInt(parameters[1]);
        int indiceFin = Integer.parseInt(parameters[2]);

        this.document.effacer(indiceDebut,indiceFin);
        super.executer();
    }
}
