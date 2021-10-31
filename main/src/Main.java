package com.company;

import com.company.TaskOne;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n######### task 1 ########\n");
        TaskOne taskOne = new TaskOne();
        taskOne.main();
        System.out.println("\n######### task 2 ########\n");
        TaskTwo taskTwo = new TaskTwo();
        taskTwo.main();
        System.out.println("\n######### task 3 ########\n");
        TaskThree taskThree = new TaskThree();
        taskThree.main();
    }
}