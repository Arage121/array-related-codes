package com.company;

import java.util.*;

public class twodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] two = new int[3][3];
        for(int r=0;r<two.length;r++){
            for (int c=0;c<two[r].length;c++){
                two[r][c]= sc.nextInt();
            }
        }
           /* for(int r=0;r<two.length;r++){                         // by using normal for loop
                System.out.println(Arrays.toString(two[r]));         // instead of using same for loop again like in getting input we can use this method to get output
        }*/
        for (int[] a:two) {                                           //by using forEach loop , it will print every element on array
            System.out.println(Arrays.toString(a));
        }

    }
}
