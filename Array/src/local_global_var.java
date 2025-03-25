package Array.src;

public class local_global_var {
    public static void main(String[] args) {
        int x=60;
        System.out.println(val);
        fun(x);
        System.out.println(val);//This is not promoted to 120
    }
    static int val=100;
    public static void fun(int x){
        int val=19;
        val=120;//Here this val is promoted to local variable and not to global variable
        //If we want to promote it to global then we have to write Global_Variable.val
        System.out.println(val);

    }
}
