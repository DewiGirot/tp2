package ManipulationAvancee;

public class Point {

    private int x, y;

    public Point (int x, int y) {
        this.x = x ;
        this.y = y ;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void afficher ()
    {
        System.out.println ("Coordonnées " + getX() + " " + getY()) ;
    }

    public int normeMax(){
        if(getX()>getY()){
            return getX();
        }else {
            return getY();
        }
    }
}
