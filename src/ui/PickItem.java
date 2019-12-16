package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PickItem {

    private static Scanner input;
    private static List<String> items;

    public static void main(String[] args) {
        System.out.println("enter your items:");
        System.out.println("type 'done' when finished");

        input = new Scanner(System.in);
        items = new ArrayList<>();
        Random rand = new Random();

        while (input.hasNext()) {
            String item = input.next();
            if (item.equals("done")) {
                break;
            }
            addItems(item);
        }
        System.out.println(items.size());
        if (!items.isEmpty()) {
            System.out.println("here is a random item:");
            for (int i = 0; i < 10; i++) {
                System.out.println(items.get(rand.nextInt(items.size())));
            }
        }
    }

    public static void addItems(String s) {
        items.add(s);
    }
}