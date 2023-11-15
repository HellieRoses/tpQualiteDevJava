package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());
    }

    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Hello, world!");
        document.remplacer(7, 12, "Universe");
        assertEquals("Hello, Universe!", document.getTexte());
    }

    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("hello");
        document.majuscules(0, 4);
        assertEquals("HELLo", document.getTexte());
    }

        public void testEffacer() {
        Document document = new Document();
        document.setTexte("Hello, world!");
        document.effacer(5, 12);
        assertEquals("Hello!", document.getTexte());
    }

    public void testInserer() {
        Document document = new Document();
        document.setTexte("Hello!");
        document.insert(4, " world");
        assertEquals("Hello world!", document.getTexte());
    }

    public void testClear() {
        Document document = new Document();
        document.setTexte("Hello");
        document.clear();
        assertEquals("", document.getTexte());
    }
}
