package ru.job4j.tracker;

/**
 * Class interface.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public interface Input {

    /**
     * Переменная результат.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    String ask(String[] question);

    /**
     * Переменная результат.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    String ask(String question);
}