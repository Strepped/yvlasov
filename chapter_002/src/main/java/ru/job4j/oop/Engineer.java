package ru.job4j.oop;

/**
 * Created by Strepped on 19.04.2017.
 */
public class Engineer extends Profession {

    public Engineer(String name, String skill, boolean license) {
        super(name, skill, license);
    }

    public String create (Project project) {
        return "Инжинер " + getName() + " создает проект " + project.getName();
    }
}