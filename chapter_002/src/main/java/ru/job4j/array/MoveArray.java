package ru.job4j.array;

/**
 * Created by Strepped on 16.05.2017.
 *
 * Задан числовой массив.
 * Нужно реализовать метод кольцевого сдвига на N. int[] shift().
 * Не использовать дополнительный массив.
 * Например, [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3]
 *
 */
public class MoveArray {

    /**
     * Поле.
     */
    private int[] array;

    /**
     * Метод производит сложение.
     * @param array - f
     */
    public MoveArray(int[] array) {
        this.array = array;
    }

    /**
     * Метод производит сложение.
     * @param n - f
     * @return Возвращает параметр.
     */
    public int[] shift(int n) {
        for (int i = 0; i < n; i++) {
            int temp = array[i];
                array[i] = array[array.length - n + i];
                array[array.length - n + i] = array[array.length - n + i - 1];
                array[array.length - n + i - 1] = temp;
            }
        return array;
    }
}