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
    private static final int GETALL = 2;
    private static final int UPDATE = 3;
    private static final int DELETE = 4;
    private static final int FINDBYID = 5;
    private static final int DINDBYNAME = 6;
    private static final int EXIT = 7;
    ConsoleInput input = new ConsoleInput();
    Tracker tracker = new Tracker();
    public void select() {
        int key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
        while (key != EXIT) {
            if (key == ADD) {
                String name = input.ask("Введите имя");
                String desc = input.ask("Введите desc");
                Date created = new Date(System.currentTimeMillis());
                Item item = new Item(name, desc, created); //
                tracker.add(item);
                key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            }
            if (key == GETALL) {
                for (Item items : tracker.getAll()) {
                    System.out.println(items);
                    key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
                }
            }
            if (key == UPDATE) {
                String name = input.ask("Введите имя");
                String desc = input.ask("Введите desc");
                Date created = new Date(System.currentTimeMillis());
                Item item = new Item(name, desc, created);
                tracker.update(item);
                key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            }
            if (key == DELETE) {
                String id = input.ask("Введите id");
                tracker.delete(id);
                key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            }
            if (key == FINDBYID) {
                String id = input.ask("Введите id");
                System.out.println(tracker.findById(id));
                key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            }
            if (key == DINDBYNAME) {
                String name = input.ask("Введите имя");
                for (Item items : tracker.findByName(name)) {
                    System.out.println(items);
                }
                key = input.ask(new String[]{"Выбирите действие: ", " 1. Добавить новый элемент.", " 2. Показать все элемены.", " 3. Редактировать элемент.", " 4. Удалить элемент.", " 5. Найти элемент по id.", " 6. Найти элемент по имени.", " 7. Выйти"});
            }
        }
    }
}