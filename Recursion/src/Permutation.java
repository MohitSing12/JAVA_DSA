public class Permutation {
    public static void main(String[] args) {
        String ques = "abca";
        //Total permuatations for "abc" is 3! i.e. 6
        Printanswer(ques, "");
    }

    public static void Printanswer(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        for (int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            Printanswer(s1+s2,ans+ch);
        }
    }
    }
