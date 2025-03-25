public class Stack_implementation {
    public static void main(String[] args) throws Exception{
        stack st=new stack();
        System.out.println( st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

   st.display();
        System.out.println(st.peek());
//   st.push(32);
    }
}
