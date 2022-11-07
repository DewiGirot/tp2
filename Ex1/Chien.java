package Ex1;

public class Chien {

  private int age;
  private String race;
  private String color;

  /**
   * Constructeur de la class chien
   * 
   * @author DewiGirot3il
   * @date 07/11/2022
   * 
   * @param age
   *              L'âge du chien
   * 
   * @param race
   *              Race du chien
   * 
   * @param color
   *              Couleur du chien
   * 
   * @return Un nouveau chien
   */
  public Chien(int age, String race, String color) {
    this.age = age;
    this.race = race;
    this.color = color;
  }

  public void aboyer() {
    System.out.println("Wouaf");
  }

  public void dormir() {
    System.out.println("Zzzzz");
  }

}