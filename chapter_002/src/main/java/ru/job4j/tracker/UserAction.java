package ru.job4j.tracker;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public interface UserAction {

    /**
     * Переменная результат.
     * @return Возвращает параметр.
     */
    int key();

    /**
     * Переменная результат.
     * @param input - первая переменная.
     * @param tracker - первая переменная.
     */
    void execute(Input input, Tracker tracker);

    /**
     * Переменная результат.
     * @return Возвращает параметр.
     */
    String info();
}