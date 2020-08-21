package com.sematec.java.lib;

public class TestSwitch {

    public static void main(String[] args) {
        int userInput = 6;

        switch (userInput) {
            case 0:
                System.out.println("Setting");
                break;
            case 1:
                System.out.println("Game");
                break;
            case 2:
                System.out.println("Restart");
                break;
            case 3:
                System.out.println("Profile");
                break;
            case 4:
                System.out.println("Help");
                break;
            case 5:
                System.out.println("About");
                break;
            default:
                System.out.println("Wrong Choice!");
        }
    }
}
