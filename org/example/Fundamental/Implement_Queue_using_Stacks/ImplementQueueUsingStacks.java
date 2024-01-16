package org.example.Fundamental.Implement_Queue_using_Stacks;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> stackOnAppend;
    Stack<Integer> stackOnReturn;

    public ImplementQueueUsingStacks() {
        this.stackOnAppend = new Stack<>();
        this.stackOnReturn = new Stack<>();
    }

    public void push(int x) {
        if (!stackOnReturn.empty()) {
            while (!stackOnReturn.empty())
                stackOnAppend.push(stackOnReturn.pop());
        }
        stackOnAppend.push(x);
    }

    public int pop() {
        if (!stackOnAppend.empty()) {
            while (!stackOnAppend.empty())
                stackOnReturn.push(stackOnAppend.pop());
            }
        return stackOnReturn.pop();
    }

    public int peek() {
        if (!stackOnAppend.empty()) {
            while (!stackOnAppend.empty()){
                stackOnReturn.push(stackOnAppend.pop());
            }
        }
        return stackOnReturn.peek();
    }

    public boolean empty() {
        return stackOnAppend.empty() && stackOnReturn.empty();
    }
}
