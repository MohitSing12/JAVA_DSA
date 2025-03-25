public class Count_Subsequence {
    public static void main(String[] args) {
        String ques="abc";
        PrintSubSeq(ques,"");
        System.out.println(count);
    }
    static int count=0;
    public static void PrintSubSeq(String ques,String ans){

        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }

        char ch=ques.charAt(0);
        PrintSubSeq(ques.substring(1),ans);
        PrintSubSeq(ques.substring(1),ans+ch);

    }
}
