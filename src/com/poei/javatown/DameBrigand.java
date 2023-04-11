package com.poei.javatown;

public class DameBrigand extends Dame implements HorsLaLoi {

    protected String look = "méchante";
    private int nbDamesEnlevees;
    private int miseAPrix = 100;
    private boolean etat = false; // false : libre / true : emprisonné


    DameBrigand(String nom, int nbDamesEnlevees) {
        super(nom, "lait");
        super.setCouleurRobe("verte");
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    DameBrigand(String nom, String boissonFavorite, int nbDamesEnlevees) {
        super(nom, boissonFavorite);
        super.setCouleurRobe("verte");
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    @Override
    public boolean getEtat() {
        return this.etat;
    }

    @Override
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public void seFaireEmprisonner(Sherif sherif) {
        this.parler("Damned, je suis faite ! " + sherif.quelEstTonNom() + ", tu m'as eue !");
        this.etat = true;
    }

    @Override
    public void kidnapper(Dame dame) {
        if (!this.etat && !dame.getCapturee()) {
            this.nbDamesEnlevees++;
            this.parler("Ah ah ! " + dame.quelEstTonNom() + ", la bourse ou la vie !");
            dame.setCapturee(true);
        }
    }

    @Override
    public int getMiseAPrix() {
        return this.miseAPrix;
    }

    @Override
    public void setMiseAPrix(int miseAPrix) {
        this.miseAPrix = miseAPrix;
    }


    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom();
    }

}
