package com.poei.javatown;

public class Brigand extends Humain implements HorsLaLoi {

    private String look = "méchant";
    private int nbDamesEnlevees;
    private int miseAPrix = 100;
    private boolean etat = false; // false : libre / true : emprisonné

    Brigand(String nom, int nbDamesEnlevees) {
        super(nom, "tord-boyaux");
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    Brigand(String nom, String boissonFavorite, int nbDamesEnlevees) {
        super(nom, boissonFavorite);
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    @Override
    public void setMiseAPrix(int miseAPrix) {
        this.miseAPrix = miseAPrix;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.nbDamesEnlevees + " dames !");
        this.parler("Ma tête est mise à prix " + this.miseAPrix + "$ !");
    }

    @Override
    public void kidnapper(Dame dame) {
        this.nbDamesEnlevees ++;
        this.parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
    }

    @Override
    public void seFaireEmprisonner(Sherif sherif) {
        this.etat = true;
        this.parler("Damned, je suis fait ! " + sherif.quelEstTonNom() + ", tu m'as eu !");
    }

    @Override
    public int getMiseAPrix() {
        return this.miseAPrix;
    }


}
