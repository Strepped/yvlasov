package ru.job4j.tracker;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class StartUI {

    /**
     * поле.
     */
    private Tracker tracker;

    /**
     * поле.
     */
    private Input input;

    /**
     * Метод производит сложение.
     * @param input - первая переменная.
     * @param tracker - первая переменная.
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Конструктор.
     */
    public void init() {
        new MenuTracker(this.tracker, this.input).select();
    }

    /**
     * Метод производит сложение.
     * @param args - первая переменная.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}