package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class ConsoleInput implements Input {

    /**
     * Переменная результат.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    public String ask(String[] question) {
        for (String v : question) {
            System.out.println(v);
        }
        return scanner.nextLine();
    }

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}