package com.company;
import java.util.Scanner;
public class repeatCount {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        while(a>0){
            int rem = a%10;
            if(rem==3){
                count++;
            }
            a= a/10;

        }
        System.out.println(count);
    }
}
