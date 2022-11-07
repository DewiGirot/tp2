package ManipulationAvancee;

public class Util {

    public static int ackerman(int m, int n){
        int ret;

        if(m==0){
            ret = n+1;
        }else if(n==0){
            ret = ackerman(m-1, 1);
        }else{
            ret = ackerman(m-1, ackerman(m, n-1));
        }
        return ret;
    }

}
