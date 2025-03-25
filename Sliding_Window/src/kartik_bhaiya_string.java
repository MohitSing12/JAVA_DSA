import java.util.Scanner;

public class kartik_bhaiya_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=sc.next();
        int a=max_length_of_string(str,'a',k);
        int b=max_length_of_string(str,'b',k);
        System.out.println(Math.max(a,b));
    }
    public static int max_length_of_string(String str,char ch,int k){
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        //Growing
        while(ei<str.length()){
            if(str.charAt(ei)==ch){
                flip++;
            }
            //Shrink
            while(flip>k&&si<=ei){
                if (str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            //Ans print
            ans=Math.max((ei-si+1),ans);
            ei++;

        }
        return ans;
    }
}
