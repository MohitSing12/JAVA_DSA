public class Queen_Permutation {
    public static void main(String[] args) {

        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        permutation(board,tq,0,"");
    }
    public static void permutation(boolean[] board,int qt,int qpsf,String ans){
        if(qt==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<board.length;i++){
            if (board[i]==false) {
                board[i]=true;
                permutation(board, qt, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i]=false;
            }
        }
    }
}