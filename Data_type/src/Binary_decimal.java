package Data_type.src;

import java.util.Scanner;

public class Binary_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        while(n>0){
            int rem=n%2;
            sum=sum+mul*rem;
            mul=mul*10;
            n=n/2;
        }
        System.out.println("The binary conversion of the number is:"+sum);

    }
}