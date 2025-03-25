import java.util.Stack;

public class Next_greater_element_ques {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        NGE(arr);


    }

    public static void NGE(int[] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {


                ans[i] = count;
//                st.pop();

                count++;


            }
            st.push(i);
//            System.out.println(st.peek());

        }

        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i] + " " + ans[i]);
        }

    }
}
