package com.company;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String Method = in.next();
        switch (Method) {
            case "Addition" -> System.out.println(a + b);
            case "Subtraction" -> System.out.println(a - b);
            case "Multiplication" -> System.out.println(a * b);
            case "Division" -> System.out.println(a / b);
            case "Modulus" -> System.out.println(a % b);
            default -> System.out.println("Please write appropriate method which you have to perform");
        }
    }
}
