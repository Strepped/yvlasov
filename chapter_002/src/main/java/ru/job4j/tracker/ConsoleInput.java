package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Created by Strepped on 24.04.2017.
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public int ask(String[] question) {
        for (String v : question) //заменить v
            System.out.println(v); // заменить v
        return scanner.nextInt();
    }

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.next();
    }
}