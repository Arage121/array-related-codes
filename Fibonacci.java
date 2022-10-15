package com.company;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(a+" ");
        System.out.print(" "+b+" ");
        for(int i=2;i<n;i++){  // here loops start from i=2 because a,b has already printed once above
            int c = a+b;
            System.out.print(" "+c+" ");
            a = b;
            b = c;
        }
    }
}