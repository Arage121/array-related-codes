package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class queueimplementationusingarraydequeue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.offer(10); // offer function is used to add the item to the end or last of queue
        q.offer(20);
        q.offer(40);
        System.out.println(q);
        System.out.println(q.peek()); // return the first item in queue
        System.out.println(q.poll()); // removes the first item and return its value
        System.out.println(q.peek());
        System.out.println(q.isEmpty());/** peek, offer, poll functions have same work functions which are element, add, remove,the only
difference is in these element or add functions the exceptions is thrown rather than printing values when the user did something wrong **/
        System.out.println(q.size());
    }
}
