package Pattern.src;

import java.util.Scanner;
//*
//**
//***
//****
//*****
public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of row:");
        int n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=n){
            //star printing in the same row.
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //next row preparation
            row++;
            star++;
            System.out.println();
        }

    }
}
