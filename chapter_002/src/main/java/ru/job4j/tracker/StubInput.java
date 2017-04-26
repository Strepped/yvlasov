package ru.job4j.tracker;

/**
 * Created by Strepped on 26.04.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public int ask(String[] question) {
        return Integer.valueOf(this.ask(question[0]));
    }

    public String ask(String question) {
        return answers[position++];
    }
}