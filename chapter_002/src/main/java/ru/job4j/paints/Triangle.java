package ru.job4j.paints;

/**
 * Created by Strepped on 29.04.2017.
 */

public class Triangle implements Shape {

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    @Override
    public String pic() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            int w = i - 1 + i;
            if (i < 3) {
                s.append(" ");
            }
            for (int y = 1; y <= w; y++) {
                s.append("^");
            }
            if (i < 3) {
                s.append(" " + System.getProperty("line.separator"));
            }
        }
        return s.toString();
    }
}