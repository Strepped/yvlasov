package ru.job4j.tracker;

/**
 * Created by Strepped on 02.05.2017.
 */
public abstract class BaseAction implements UserAction {

    String name;

    public BaseAction(String name) {
        this.name = name;
    }

    public String info() {
        return String.format("%s. %s", this.key(), name);
    }
}