package com.company;

import java.util.Arrays;

public class swapUsingStringArray {
    public static void main(String[] args) {
        String[] arr = {" add "," sub "," mul "," div "," mod "," oper "};
        // swap(arr, 0, 5);
       // System.out.println(" Swap function output: "+Arrays.toString(arr));
        reverse(arr);

        System.out.println(" Reverse function output: "+Arrays.toString(arr));
    }
    static void swap(String[] arr,int index1,int index2){
    String temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    }
    static  void reverse(String[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){

            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
