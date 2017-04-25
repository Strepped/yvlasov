package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Teacher extends Profession {

    /**
     * Метод производит сложение.
     * @param name - первая переменная.
     * @param skill - первая переменная.
     * @param license - первая переменная.
     */
    public Teacher(String name, String skill, boolean license) {
        super(name, skill, license);
    }

    /**
     * Метод производит сложение.
     * @param children - первая переменная.
     * @return Возвращает параметр.
     */
    public String teach(Children children) {
        return "Учитпль " + getName() + " учит " + children.getName();
    }
}