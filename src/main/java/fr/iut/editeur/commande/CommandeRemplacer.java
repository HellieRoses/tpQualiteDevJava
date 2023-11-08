package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
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
        String texte = parameters[3];
        this.document.remplacer(indiceDebut,indiceFin,texte);
        super.executer();
    }
}
