package OOPS_2;

public interface StackI {
int x=10;  //By default the variable inside interface is public,static,and final
    public void push(int item);

    public int pop();

    public int peek();

    //After Java8
//    static void fun(){
//
//    }
//    default void fun1(){
//
//    }
//    private static int fun2(){
//        return 0;
//    }
}
