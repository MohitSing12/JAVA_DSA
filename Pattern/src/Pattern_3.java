package Pattern.src;

import java.util.Scanner;
//*****
//****
//***
//**
//*
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of row:");
        int n=sc.nextInt();
        int row=1;
        int star=5;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row++;
            star--;
            System.out.println();
        }
    }
}
