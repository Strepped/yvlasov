package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Profession {

    /**
     * Переменная результат.
     */
    private String name;
    /**
     * Переменная результат.
     */
    private String skill;
    /**
     * Переменная результат.
     */
    private boolean license;

    /**
     * Метод производит сложение.
     * @param name - первая переменная.
     * @param skill - первая переменная.
     * @param license - первая переменная.
     */
    public Profession(String name, String skill, boolean license) {
        this.name = name;
        this.skill = skill;
        this.license = license;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public String getSkill() {
        return this.skill;
    }

    /**
     * Метод производит сложение.
     * @return Возвращает параметр.
     */
    public boolean getLicense() {
        return this.license;
    }
}