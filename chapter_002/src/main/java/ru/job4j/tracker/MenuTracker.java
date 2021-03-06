package ru.job4j.tracker;

import java.util.Date;

/**
 * Class ConsoleInput.
 */
public class MenuTracker {

    /**
     * пполе.
     */
    private Tracker tracker;

    /**
     * поле.
     */
    private Input input;

    /**
     * поле.
     */
    private UserAction[] actions = new UserAction[6];

    /**
     * Консруктор для MenuTracker.
     *
     * @param tracker - переменная.
     * @param input   - перемпнная.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Метод.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem("");
        this.actions[1] = this.new FindAllItem("");
        this.actions[2] = this.new UpdateItem("");
        this.actions[3] = this.new Delete("");
        this.actions[4] = this.new FindById("");
        this.actions[5] = this.new FindByName("");
    }

/**
     * Метод производит сложение.
     * @return Возвращает параметр.
 */
    public int[] getActions() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    /**
     * Консруктор для MenuTracker.
     *
     * @param key - переменная.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Метод.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Class ConsoleInput.
     */
    private class AddItem extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public AddItem(String name) {
            super("Добавить найвый элемент:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 0;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя");
            String desc = input.ask("Введите desc");
            Date created = new Date(System.currentTimeMillis());
            tracker.add(new Item(name, desc, created));
        }
    }

    /**
     * Class ConsoleInput.
     */
    private class FindAllItem extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public FindAllItem(String name) {
            super("Покахать все элементы:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 1;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.getAll()) {
                System.out.println(String.format("%s; %s; %s", "id: " + item.getId(), "  Имя: " + item.getName(), "  Автор: " + item.getDesc()));
            }
        }
    }

    /**
     * Class ConsoleInput.
     * @author Yury Vlasov
     * @since 24.04.2017
     * @version 1.0
     */
    class UpdateItem extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public UpdateItem(String name) {
            super("Редактировать элемент по id:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 2;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id");
            String name = input.ask("Введите имя");
            String desc = input.ask("Введите desc");
            Date created = new Date(System.currentTimeMillis());
            Item item = new Item(name, desc, created);
            item.setId(id);
            tracker.update(item);
        }
    }

    /**
     * Class ConsoleInput.
     */
    class Delete extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public Delete(String name) {
            super("Удалить элемент по id:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 3;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id");
            tracker.delete(id);
        }
    }

    /**
     * Class ConsoleInput.
     */
    class FindById extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public FindById(String name) {
            super("Поиск элемента по id:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 4;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id");
            Item item = tracker.findById(id);
            System.out.println(String.format("%s; %s; %s", "id: " + item.getId(), "  Имя: " + item.getName(), "  Автор: " + item.getDesc()));
        }
    }

    /**
     * Class ConsoleInput.
     */
    class FindByName extends BaseAction {

        /**
         * Метод производит сложение.
         * @param name - первая переменная.
         * @return - первая переменная.
         */
        public FindByName(String name) {
            super("Поиск элементов по имени:");
        }

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public int key() {
            return 5;
        }

        /**
         * Метод производит сложение.
         * @param input - первая переменная.
         * @param tracker - первая переменная.
         */
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя");
            for (Item item : tracker.findByName(name)) {
                System.out.println(String.format("%s; %s; %s", "id: " + item.getId(), "  Имя: " + item.getName(), "  Автор: " + item.getDesc()));
            }
        }
    }
}