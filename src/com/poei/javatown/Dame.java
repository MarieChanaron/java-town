package com.poei.javatown;

public class Dame extends Humain {

    private String couleurRobe;
    private boolean etat; // false = libre / true = captive

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

    @Override
    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        this.parler("Regardez ma belle robe " + this.couleurRobe + " !");
    }

    public void seFaireKidnapper() {
        this.etat = true;
        this.parler("Ooouuuu ! Lâche-moooooiii !!!");
    }

    public void etreLiberee(Cowboy cowboy) {
        this.parler("Comment pourrais-je assez te remercier, " + cowboy.getCaracteristique() + " " + cowboy.quelEstTonNom() + " ?");
    }

    public void setCouleurRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
    }

    public void changerRobe(String couleur) {
        this.couleurRobe = couleur;
        this.parler("Regardez ma nouvelle robe " + this.couleurRobe + " !");
    }
}
