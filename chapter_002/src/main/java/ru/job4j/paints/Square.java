package ru.job4j.paints;

/**
 * Created by Strepped on 29.04.2017.
 */
public class Square implements Shape {

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    @Override
    public String pic() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int y = 1; y <= 5; y++) {
                s.append("^");
            }
            if (i < 5) {
                s.append(System.getProperty("line.separator"));
            }
        }
        return s.toString();
    }
}
