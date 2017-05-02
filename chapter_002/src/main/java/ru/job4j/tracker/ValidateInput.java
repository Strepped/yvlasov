package ru.job4j.tracker;

/**
 * Created by Strepped on 02.05.2017.
 */
public class ValidateInput extends ConsoleInput {

    /**
     * Метод производит сложение.
     * @param question - первая переменная.
     * @param range - первая переменная.
     * @return Возвращает параметр.
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Введите правильный пункт меню");
            } catch (NumberFormatException nfe) {
                System.out.println("Введите правильный пункт меню");
            }
        } while (invalid);
        return value;
    }
}