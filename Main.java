package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(salary>10000){
            salary =salary+2000;
        }
        else{
            salary = salary+1000;
        }
        System.out.println(salary);
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}