import java.util.Stack;
public class Stack_reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);
        int ii=st.pop();
        Reverse(st);
        Insert_Button(st,ii);
        System.out.println(st);

    }
    public static void Reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int ii=st.pop();
        Reverse(st);
        Insert_Button(st,ii);
    }
    public static void Insert_Button(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int ii=st.pop();
        Insert_Button(st,item);
        st.push(ii);
    }
}
