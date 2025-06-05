
package Array.src;
import java.util.*;

public class global_var {
    public static void main(String[] args) {
        int x=60;
        System.out.println(val);
        fun(x);
        System.out.println(val);
    }
    static int val=100;
    public static void fun(int x){
        val=120;

        System.out.println(val);
    }
}
