import java.util.ArrayList;
import java.util.List;

public class Leetcode_39 {
    public static void main(String[] args) {
        int[] coin = {2, 1, 3, 5};
        int amount = 4;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        permutation(coin, amount, ll,ans,0);
        System.out.println(ans);
    }

    public static void permutation(int[] coin, int amount, List<Integer> ll,List<List<Integer>> ans,int index) {
        if (amount == 0) {
//            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = index; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                permutation(coin, amount - coin[i], ll,ans,i);
                ll.remove(ll.size()-1);
            }
        }
    }
}
