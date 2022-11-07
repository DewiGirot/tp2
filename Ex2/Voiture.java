package Ex2;

public class Voiture {

  private String modele;
  private int prix;
  private Pilote pilote;

  public Voiture(String modele, int prix, Pilote pilote) {
    this.modele = modele;
    this.prix = prix;
    this.pilote = pilote;
  }

  public void demarrer() {
    System.out.println("Je démarre");
  }

  public void arreter() {
    System.out.println("Je m'arrête");
  }

  public void deplacer() {
    System.out.println("Je me déplace");
  }
}