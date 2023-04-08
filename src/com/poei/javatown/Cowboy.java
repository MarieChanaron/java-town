package com.poei.javatown;

public class Cowboy extends Humain {

    protected int popularite;
    protected String caracteristique = "vaillant";

    Cowboy(String nom, int popularite) {
        super(nom, "whiskey");
        this.popularite = popularite;
    }

    Cowboy(String nom, int popularite, String boissonFavorite) {
        super(nom, boissonFavorite);
        this.popularite = popularite;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        this.parler("On dit que je suis le plus " + this.caracteristique + " de tous les cowboys et j'ai déjà libéré " + this.popularite + " dames !");
    }

    String getCaracteristique() {
        return this.caracteristique;
    }

    public void liberer(Dame dame) {
        this.popularite ++;
        this.parler("Te voilà libérée, ma belle !");
    }

    public void sexclamer() {
        this.parler("Prends ça, rascal !");
    }

    public void tirer(Brigand brigand) {
        this.parler("Le " + this.caracteristique + " " + this.quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
    }

}
