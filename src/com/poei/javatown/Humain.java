package com.poei.javatown;

public class Humain {

    private String nom;
    private String boissonFavorite;

    Humain (String nom) {
        this.nom = nom;
        this.boissonFavorite = "eau";
    }

    Humain(String nom, String boissonFavorite) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public String quelEstTonNom() {
        return this.nom;
    }

    public void parler(String texte) {
        System.out.println("(" + this.quelEstTonNom() + ") - " + texte);
    }

    public String getBoissonFavorite() {
        return this.boissonFavorite;
    }

    public void sePresenter() {
        boolean voyelle = Util.estVoyelle(this.boissonFavorite.charAt(0));
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime l" + (voyelle ? "'" : "e ") + this.boissonFavorite + ".");
    }

    public void boire() {
        boolean voyelle = Util.estVoyelle(this.boissonFavorite.charAt(0));
        this.parler("Ah ! Un bon verre d" + (voyelle ? "'" : "e ") + this.boissonFavorite + " ! GLOUPS !");
    }
}
