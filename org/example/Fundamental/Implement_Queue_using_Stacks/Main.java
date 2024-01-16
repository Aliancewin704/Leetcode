package org.example.Fundamental.Implement_Queue_using_Stacks;

public class Main {

    public static void main(String[] args) {
        ImplementQueueUsingStacks im = new ImplementQueueUsingStacks();
        im.push(1);
        im.push(2);
        System.out.println(im.peek());
        System.out.println(im.pop());
        System.out.println(im.empty());
    }
}
