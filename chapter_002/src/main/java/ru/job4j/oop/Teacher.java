package ru.job4j.oop;

/**
 * Created by Strepped on 19.04.2017.
 */
public class Teacher extends Profession{

    public Teacher(String name, String skill, boolean license) {
        super(name, skill, license);
    }

    public String teach (Children children) {
        return "Учитпль " + name + " учит " + children.name;
    }
}
