import java.util.Stack;

public class Basics_stack {
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack<>();
        ss.push(20);
        ss.push(21);
        System.out.println(ss.peek());
        System.out.println(ss);
        System.out.println(ss.isEmpty());
        System.out.println(ss.pop());
        System.out.println(ss);
    }
}