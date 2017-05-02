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
    public String ask(String[] question) {
        return this.ask(question);
    }

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @return Возвращает параметр.
     */
    public String ask(String question) {
        return answers[position++];
    }

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @param range - первая переменная.
     * @return Возвращает параметр.
     */
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Вышли за пределы меню");
        }
    }
}