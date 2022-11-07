package Etudiant;

public class Etudiant{

  private String nom;

  public Etudiant(String nom){
    this.nom = nom;
  }

  public String getNom() {
    return this.nom;
  }

  public void travailler(){
    if(getNom().equals("Philippe")){
      System.out.println("Philippe se met au travail !");
    }
  }

  public void seReposer(){
    if(getNom().equals("Philippe")){
      System.out.println("Philippe se repose !");
    }
  }

}