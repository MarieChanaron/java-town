package com.poei.javatown;

public class Cowboy extends Humain implements VisagePale {

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
        this.parler("On dit que je suis le plus " + this.caracteristique + " de tous les cowboys et j'ai déjà libéré " + this.popularite + " dame" + (this.popularite > 1 ? "s" : "") + " !");
    }

    String getCaracteristique() {
        return this.caracteristique;
    }

    public void liberer(Dame dame) {
        if (dame.getCapturee()) {
            this.popularite++;
            this.parler("Te voilà libérée, ma belle !");
            dame.setCapturee(false);
        }
    }

    public void sexclamer(HorsLaLoi horsLaLoi) {
        this.parler("Prends ça, rascal !");
    }

    public void tirer(HorsLaLoi horsLaLoi) {
        this.parler("Le " + this.caracteristique + " " + this.quelEstTonNom() + " tire sur " + horsLaLoi.quelEstTonNom() + ". PAN !");
    }

    @Override
    public void seFaireScalper(Indien indien) {
        this.parler("Aïe ma tête !");
    }

}
