package Data_type.src;

import java.util.Scanner;

public class Fahrenheit_celcius_question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minf=sc.nextInt();
        int maxf=sc.nextInt();
        int step=sc.nextInt();
        for(int i=minf;i<maxf;i=i+step){
           int c=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+c);
        }
    }
}
