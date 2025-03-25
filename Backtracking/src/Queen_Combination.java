public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        combination(board,tq,0,"",0);
    }
    public static void combination(boolean[] board,int qt,int qpsf,String ans,int idx){
        if(qt==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i=idx;i<board.length;i++){
            if (board[i]==false) {
                board[i]=true;
                combination(board, qt, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
                board[i]=false;
            }
        }
    }
}
