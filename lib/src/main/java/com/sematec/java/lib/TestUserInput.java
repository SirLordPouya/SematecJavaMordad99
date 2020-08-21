package com.sematec.java.lib;

import java.util.Scanner;

public class TestUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your Name:");
        String name = scanner.nextLine();
    }
}
