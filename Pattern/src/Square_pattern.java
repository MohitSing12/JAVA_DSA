import java.util.Scanner;

public class Square_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2+1;
        int star=1;
        while(row<=n){
           if(row==1||row==n){
               int i=1;
               while(i<=n) {
                   System.out.print("* ");
                   i++;
               }  }
               else{
                   System.out.print("* ");
                   int j = 1;
                   while (j <= space) {
                       System.out.print("  ");
                       j++;
                   }
                   System.out.print("* ");
               }
               row++;
               System.out.println();

        }
    }
}
