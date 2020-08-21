package com.sematec.java.lib;

import java.util.ArrayList;

public class TestArray {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add(20);
        scores.add(22);
        scores.add(30);
        scores.add(50);
        scores.add(2);
        scores.add(200);

        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            System.out.println(score);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya");
        names.add("Ali");
        names.add("Mamad");

    }
}
