package Etudiant;

public class Segment {

    private int extr1, extr2;

    public Segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
        if(this.extr1 < this.extr2){
            ordonne();
        }
    }

    public int getExtr1() {
        return this.extr1;
    }
    public int getExtr2() {
        return this.extr2;
    }
    public void setExtr1(int extr1) {
        this.extr1 = extr1;
    }
    public void setExtr2(int extr2) {
        this.extr2 = extr2;
    }

    private void ordonne(){
        if(getExtr1() < getExtr2()){
            int tmp = getExtr1();
            setExtr2(getExtr1());
            setExtr1(tmp);
        }
    }

    public int longueur(){
        return getExtr2() - getExtr1();
    }

    @Override
    public String toString() {
        return "Segment{" + "extr1=" + extr1 + ", extr2=" + extr2 + '}';
    }
}
