package ru.job4j.tracker;

/**
 * Created by Strepped on 26.04.2017.
 */
public class StubInput implements Input {
    /**
     * Переменная результат.
     */
    private String[] answers;
    /**
     * Переменная результат.
     */
    private int position = 0;

    /**
     * Метод производит сложение.
     * @param answers - первая переменная.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    @Override
    public int ask(String[] question) {
        return Integer.valueOf(this.ask(question[0]));
    }

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    public String ask(String question) {
        return answers[position++];
    }
}