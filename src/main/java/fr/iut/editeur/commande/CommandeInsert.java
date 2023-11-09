package fr.iut.editeur.commande;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeInsert extends CommandeDocument {


    public CommandeInsert(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu :  inserer;debut;texte");
            return;
        }
        String texte = parameters[2];
        int deb = Integer.parseInt(parameters[1]);
        this.document.insert(deb,texte);
        super.executer();
    }

}
