package com.company;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<String> abs = new ArrayDeque<>();
        abs.offer("One");
        abs.offer("Two");
        abs.offer("Three");
        System.out.println("Queue: " + abs);

        String d = abs.poll();
        System.out.println("Removed Element: " + d);

        System.out.println("Queue after deletion: " + abs);

        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Ananas");
        stack.push("Banana");
        System.out.println("Stack: " + stack);
        stack.pop();
        System.out.println("\nAfter popping out" + stack);

    }
}














