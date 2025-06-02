package STACK.src;

import java.sql.SQLOutput;
import java.util.Stack;

public class DI_String_ques_2375 {
    public static void main(String[] args) {
        String s="DDDIIDD";
        String a=DI_String(s);
        System.out.println(a);
    }
    public static String DI_String(String s){
        int[] ans=new int[s.length()+1];
        int count=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while(!st.isEmpty()){
                    ans[st.pop()]=count;
                    count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s1="";
        for(int i=0;i<ans.length;i++){
            s1+=ans[i];
        }
        return s1;
    }

}
