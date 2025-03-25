import java.util.*;
public class Stock_span_ques{

    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        span(arr);


    }
    public static void span(int[] arr){
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print("END");
    }

}

