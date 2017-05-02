package ru.job4j.tracker;

/**
 * Created by Strepped on 02.05.2017.
 */
public class MenuOutException extends RuntimeException {

    /**
     * Метод.
     * @param msg - первая переменная.
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
