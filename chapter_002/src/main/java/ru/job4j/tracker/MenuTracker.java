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
        this.actions[0] = this.new AddItem();
        this.actions[1] = this.new FindAllItem();
        this.actions[2] = this.new UpdateItem();
        this.actions[3] = this.new Delete();
        this.actions[4] = this.new FindById();
        this.actions[5] = this.new FindByName();
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
    private class AddItem implements UserAction {

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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Добавьте новый элемент: ");
        }
    }

    /**
     * Class ConsoleInput.
     */
    private class FindAllItem implements UserAction {

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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Показать все элементы: ");
        }
    }

    /**
     * Class ConsoleInput.
     * @author Yury Vlasov
     * @since 24.04.2017
     * @version 1.0
     */
    class UpdateItem implements UserAction {
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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Редактировать элемент: ");
        }
    }

    /**
     * Class ConsoleInput.
     */
    class Delete implements UserAction {

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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Удалить элемент: ");
        }
    }

    /**
     * Class ConsoleInput.
     */
    class FindById implements UserAction {

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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Поиск элемента по id: ");
        }
    }

    /**
     * Class ConsoleInput.
     */
    class FindByName implements UserAction {

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

        /**
         * Метод производит сложение.
         * @return - первая переменная.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Поиск эелемента по имени: ");
        }
    }
}