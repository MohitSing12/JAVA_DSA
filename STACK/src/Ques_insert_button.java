import java.util.Stack;



public class Ques_insert_button {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insertButton(st,-5);
        System.out.println(st);

    }


    public static void insertButton(Stack<Integer> st,int item){
if(st.isEmpty()){
    st.push(item);
    return;
}
int i=st.pop();
insertButton(st,item);
st.push(i);
    }
}
