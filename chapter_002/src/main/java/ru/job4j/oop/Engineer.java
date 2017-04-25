package ru.job4j.oop;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Engineer extends Profession {

    /**
     * Метод производит сложение.
     * @param name - первая переменная.
     * @param skill - первая переменная.
     * @param license - первая переменная.
     */
    public Engineer(String name, String skill, boolean license) {
        super(name, skill, license);
    }

    /**
     * Метод производит сложение.
     * @param project - первая переменная.
     * @return Возвращает параметр.
     */
    public String create(Project project) {
        return "Инжинер " + getName() + " создает проект " + project.getName();
    }
}