public class Tower_Of_hanoi {
    public static void main(String[] args) {
        int n=3;
        toh(n,"A","B","C");
    }
    public static void toh(int n,String src,String help,String dest){
        if(n==0){
            return;
        }
        toh(n-1,src,dest,help);
        System.out.println("Move "+n+"th from "+src+" to "+dest);
        toh(n-1,help,src,dest);
    }
}
