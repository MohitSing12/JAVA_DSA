package Recursion.src;

public class Duplicate_permutation {
    public static void main(String[] args) {
        String ques="abca";
        printAnswer(ques,"");
    }
    public static void printAnswer(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<ques.length();i++){
            boolean flag=false;
            char ch=ques.charAt(i);
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch) {
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);

                printAnswer(s1+s2,ans+ch);
            }
        }
    }
}
