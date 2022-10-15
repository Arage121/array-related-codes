package com.company;


public class linkedlistimplementationofstack {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static class Mystack{
        Node head;
        int sz;
        Mystack(){
            head = null;
            sz = 0;
        }
        int size(){
            return sz;
        }
        boolean isEmpty(){
            return head == null;
        }
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            sz++;
        }
        int pop(){
            if(head == null) return Integer.MAX_VALUE;
            int res = head.data;
            head = head.next;
            sz--;
            return res;
        }
        int peek(){
            if(head == null) return Integer.MAX_VALUE;
            return head.data;
        }
    }
    public static void main(String[] args) {
        Mystack s = new Mystack();
        s.push(5);
        s.push(10);
        s.push(20);
        s.pop();
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
