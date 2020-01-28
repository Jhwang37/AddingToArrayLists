package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean start = true;
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");

        System.out.println(colors.get(1));

        System.out.println("Enter a color to the list: ");
        String input = scan.nextLine();
        colors.add(input);
        while (start) {
            System.out.println("Add another: ");
            input = scan.nextLine();
            colors.add(input);
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for using");
                start = false;
            }
        }
        for (String x : colors) {
            System.out.println(x);
        }
    }
}
