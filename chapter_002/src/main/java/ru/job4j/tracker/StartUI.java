package ru.job4j.tracker;

/**
 * Class ConsoleInput.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 *  * Created by Strepped on 20.04.2017.
Tracker tracker = new Tracker();
Item item1 = new Item("fs1", "1", 1);
Item item2 = new Item("fs2", "2", 2);
Item item3 = new Item("fs3", "3", 3);
Item item4 = new Item("fs4", "4", 4);
item1.setId(tracker.generateId());
item2.setId(tracker.generateId());
item3.setId(tracker.generateId());
item4.setId(tracker.generateId());
tracker.add(item1);
tracker.add(item2);
tracker.add(item3);
tracker.add(item4);

System.out.println("Весь список");
for (Item items : tracker.getAll()) {
System.out.println(items);
}

tracker.delete(item2.getId());
tracker.delete(item4.getId());
System.out.println("Список после удаления");
for (Item items : tracker.getAll()) {
System.out.println(items);
}

System.out.println("Поиск item 1 по id");
System.out.println(tracker.findById(item1.getId()));

System.out.println("Поиск item 1 по имени");
for (Item items : tracker.findByName("fs1")) {
System.out.println(items);
}

System.out.println("Список после update");
Item item5 = new Item(item1.getId(), "upd", "upd", 45);
tracker.update(item5);
for (Item items : tracker.getAll()) {
System.out.println(items);
 */
public class StartUI {

    /**
     * поле.
     */
    private Tracker tracker;

    /**
     * поле.
     */
    private Input input;

    /**
     * Метод производит сложение.
     * @param input - первая переменная.
     * @param tracker - первая переменная.
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     * Конструктор.
     */
    public void init() {
        new MenuTracker(this.tracker, this.input).select();
    }

    /**
     * Метод производит сложение.
     * @param args - первая переменная.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}