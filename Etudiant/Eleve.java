package Etudiant;

public class Eleve {

    private String name;
    private int[] listeNotes;
    private double moyenne;

    public Eleve(String name, int[] listeNotes) {
        this.name = name;
        this.listeNotes = listeNotes;
        if(this.listeNotes.length == 0){
            this.moyenne = 10;
        }
    }



}
