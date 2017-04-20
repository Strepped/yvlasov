package ru.job4j.oop;

public class Profession {
    private String name;
    private String skill;
    private boolean license;

    public Profession(String name, String skill, boolean license) {
        this.name = name;
        this.skill = skill;
        this.license = license;
    }

    public String getName() {
        return this.name;
    }

    public String getSkill() {
        return this.skill;
    }

    public boolean getLicense() {
        return this.license;
    }
}