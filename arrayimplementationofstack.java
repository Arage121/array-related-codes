package com.company;

import java.util.*;

class MyStack{
int arr[]; // using array but using arraylist is most preferred as it is beneficial than this
int cap;
int top;
MyStack(int c){
    top = -1;
    cap = c;
    arr = new int[cap];
}
void push(int x){
    if(top==cap-1){System.out.println("Stack is full");return;}
    top++;
    arr[top] = x;
}
int pop(){
    if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
    int res = arr[top];
    top--;
    return res;
}
int size(){
    return top+1;
}
int peek(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        return arr[top];
}
boolean isEmpty(){
    return top == -1;
}
/**
ArrayList<Integer> al=new ArrayList<>(); // using arraylist
    void push(int x){
        al.add(x);
    }

    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    int peek(){
        return al.get(al.size()-1);
    }

    int size(){
        return al.size();
    }

    boolean isEmpty(){
        return al.isEmpty();
    }**/
}

public class arrayimplementationofstack {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.size());
        System.out.println(s.size());
        System.out.println(s.pop()); // the removed will show here i.e 20 and 10 is only left
        System.out.println(s.isEmpty());
        System.out.println(s.peek()); //it took the highest value present in stack which is 10 i.e only left in the whole stack
    }
}
