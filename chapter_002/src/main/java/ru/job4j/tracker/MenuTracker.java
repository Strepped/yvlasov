package ru.job4j.tracker;

import java.util.Date;

/**
 * Created by Strepped on 24.04.2017.
 */
public class MenuTracker {
    /**
     * пунтк меню для добавления.
     */
    private static final int ADD = 1;
    /**
     * пунтк меню для добавления.
     */
    private static final int GETALL = 2;
    /**
     * пунтк меню для добавления.
     */
    private static final int UPDATE = 3;
    /**
     * пунтк меню для добавления.
     */
    private static final int DELETE = 4;
    /**
     * пунтк меню для добавления.
     */
    private static final int FINDBYID = 5;
    /**
     * пунтк меню для добавления.
     */
    private static final int DINDBYNAME = 6;
    /**
     * пунтк меню для добавления.
     */
    private static final int EXIT = 7;

    /**
     * пполе.
     */
    private final Tracker tracker;

    /**
     * поле.
     */
    private final Input input;

    /**
     * Консруктор для MenuTracker.
     * @param tracker - переменная.
     * @param input - перемпнная.
     */
    public MenuTracker(Tracker tracker, Input input) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Метод производит сложение.
     */
    public void select() {
        int key = 0;
        while (key != EXIT) {
            key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            if (key == ADD) {
                String name = input.ask("Введите имя");
                String desc = input.ask("Введите desc");
                Date created = new Date(System.currentTimeMillis());
                Item item = new Item(name, desc, created); //
                tracker.add(item);
            }

            if (key == GETALL) {
                for (Item items : tracker.getAll()) {
                    System.out.println(items);
                }
                String space = input.ask("введите 0 для продолжения");
            }

            if (key == UPDATE) {
                String id = input.ask("Введите id");
                String name = input.ask("Введите имя");
                String desc = input.ask("Введите desc");
                Date created = new Date(System.currentTimeMillis());
                Item item = new Item(id, name, desc, created);
                tracker.update(item);
                String space = input.ask("введите 0 для продолжения");
            }

            if (key == DELETE) {
                String id = input.ask("Введите id");
                tracker.delete(id);
                String space = input.ask("введите 0 для продолжения");
            }

            if (key == FINDBYID) {
                String id = input.ask("Введите id");
                System.out.println(tracker.findById(id));
                String space = input.ask("введите 0 для продолжения");
            }

            if (key == DINDBYNAME) {
                String name = input.ask("Введите имя");
                for (Item items : tracker.findByName(name)) {
                    System.out.println(items);
                }
                String space = input.ask("введите 0 для продолжения");
            }
        }
    }
}