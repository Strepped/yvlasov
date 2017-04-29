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
            for (int y = i; y < 3; y++) {
                s.append(" ");
            }
            for (int x = 1; x <= w; x++) {
                s.append("^");
            }
            if (i < 3) {
                s.append(System.getProperty("line.separator"));
            }
        }
        return s.toString();
    }
}