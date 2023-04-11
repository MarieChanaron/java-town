package com.poei.javatown;

public class Dame extends Humain implements VisagePale {

    private String couleurRobe;
    private boolean capturee; // false = libre / true = captive - capturée : pour ne pas confondre avec l'état des brigands (emprisonné)

    Dame(String nom) {
        super(nom, "lait");
        this.couleurRobe = "rose";
    }

    Dame(String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.couleurRobe = "rose";
    }

    Dame(String nom, String boissonFavorite, String couleurRobe) {
        super(nom, boissonFavorite);
        this.couleurRobe = couleurRobe;
    }

    public boolean getCapturee() {
        return this.capturee;
    }

    public void setCapturee(boolean capturee) {
        this.capturee = capturee;
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        this.parler("Regardez ma belle robe " + this.couleurRobe + " !");
    }

    public void seFaireKidnapper(HorsLaLoi horsLaLoi) {
        this.capturee = true;
        this.parler("Ooouuuu ! Lâche-moooooiii !!!");
    }

    public void etreLiberee(Cowboy cowboy) {
        if (this.capturee) {
            this.parler("Comment pourrais-je assez te remercier, " + cowboy.getCaracteristique() + " " + cowboy.quelEstTonNom() + " ?");
            this.capturee = false;
        }
    }

    public void setCouleurRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
    }

    public void changerRobe(String couleur) {
        this.couleurRobe = couleur;
        this.parler("Regardez ma nouvelle robe " + this.couleurRobe + " !");
    }

    @Override
    public void seFaireScalper(Indien indien) {
        this.parler("Aïe ma tête !");
    }
}
