package ru.job4j.tracker;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Strepped on 26.04.2017.
 */
public class StartUITest {

    /**
     * Test AddItem.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test", "desc", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test GetAllItem.
     */
    @Test
    public void whenUserGetAllItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Date created = new Date(System.currentTimeMillis());
        Item item1 = new Item("test1", "testDescription1", created);
        Item item2 = new Item("test1", "testDescription1", created);
        tracker.add(item1);
        tracker.add(item2);
        Item[] expected = tracker.getAll();
        Input input = new StubInput(new String[]{"1", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll(), is(expected)); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test UpdateItem.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Date created = new Date(System.currentTimeMillis());
        Item item1 = new Item("test1", "testDescription1", created);
        tracker.add(item1);
        Input input = new StubInput(new String[]{"2", item1.getId(), "reneme", "redesc", "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("reneme")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test Delete.
     */
    @Test
    public void whenUserDeleteItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Date created = new Date(System.currentTimeMillis());
        Item item1 = new Item("test1", "testDescription1", created);
        Item item2 = new Item("test2", "testDescription2", created);
        tracker.add(item1);
        tracker.add(item2);
        Input input = new StubInput(new String[]{"3", item1.getId(), "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0], is(item2)); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test FindIdItem.
     */
    @Test
    public void whenUserFindIdItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Date created = new Date(System.currentTimeMillis());
        Item item1 = new Item("test1", "testDescription1", created);
        tracker.add(item1);
        Input input = new StubInput(new String[]{"4", item1.getId(), "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test1")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Test FindNameItem.
     */
    @Test
    public void whenUserFindNameItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Date created = new Date(System.currentTimeMillis());
        Item item1 = new Item("test1", "testDescription1", created);
        tracker.add(item1);
        Input input = new StubInput(new String[]{"5", item1.getName(), "y"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test1")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
}