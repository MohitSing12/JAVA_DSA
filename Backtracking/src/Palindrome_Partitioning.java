import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> a = new ArrayList<>();
        partitioning(ques,ll,a);
        System.out.println(a);
    }

    public static void partitioning(String ques, List<String> ll, List<List<String>> a) {
        if (ques.length() == 0) {
//            System.out.println(ans);
            a.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s) == true) {
                ll.add(s);
                partitioning(ques.substring(i),ll,a);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
