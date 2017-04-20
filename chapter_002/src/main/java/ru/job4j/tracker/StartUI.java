package ru.job4j.tracker;

/**
 * Created by Strepped on 20.04.2017.
 */
public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("fs", "43", 54));
        for (Item item : tracker.getAll()) {
            System.out.println();
        }
    }
}