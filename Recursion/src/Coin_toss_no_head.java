public class Coin_toss_no_head {
    public static void main(String[] args) {
        int n=3;
        PrintAnswer(n,"");
    }
    public static void PrintAnswer(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            PrintAnswer(n-1,ans+"H");
        }
        PrintAnswer(n-1,ans+"T");
    }
}
