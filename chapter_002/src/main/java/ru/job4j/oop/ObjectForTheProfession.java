package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class ObjectForTheProfession {

    /**
     * Переменная результат.
     */
    private String name;

    /**
     * Консруктор.
     * @param name - первая переменная.
     */
    ObjectForTheProfession(String name) {
        this.name = name;
    }

    /**
     * Конструктор.
     * @return Возвращает параметр.
     */
    public String getName() {
        return this.name;
    }
}