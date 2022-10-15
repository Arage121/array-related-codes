package com.company;

import java.util.*;
import java.util.Arrays;

public class methodORfunction {
    public static void main(String[] args) {
        String message = meet("Something", " is not right");
        sum(23,34,56,76,87);
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    static String meet(String a, String b){
       String sem = a + b;
        return sem;
    }
    static void sum(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while(n>0){
           int rem = n%10;
           n = n/10;
           sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
