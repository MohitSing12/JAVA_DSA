import java.util.*;
public class Random_number {
    public static void main(String[] args) {
        int si=10;
        int ei=90;
        randnumber(si,ei);
    }
    public static void randnumber(int si,int ei){
        Random rand=new Random();
        int lo=si;
        int hi=ei;
        for (int i=0;i<10;i++){
            int rn=rand.nextInt(hi-lo+1)+lo;
            System.out.print(rn+" ");
        }
    }
}
