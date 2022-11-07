public class Etudiant{

  private String nom;

  public Etudiant(String nom){
    this.nom = nom;
  }

  public getNom(){
    return this.nom;
  }

  public static travailler(){
    if(getNom() == "Philippe"){
      System.out.println("Philippe se met au travail !");
    }
  }

  public static seReposer(){
    if(getNom() == "Philippe"){
      System.out.println("Philippe se repose !");
    }
  }
  
}