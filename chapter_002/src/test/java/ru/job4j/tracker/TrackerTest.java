package ru.job4j.tracker;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Yury Vlasov
 * @since 20.04.2017
 * @version 1.0
 */

public class TrackerTest {
	/**
	 * Test add.
	 */
	@Test
	public void whenAddNewItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", Date.from(null));
		tracker.add(item);
		assertThat(tracker.getAll()[0], is(item));
	}
	/**
	 * Test Delete.
	 */
	@Test
	public void whenDeleteItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription1", Date.from(null));
		Item item2 = new Item("test2", "testDescription2", Date.from(null));
		tracker.add(item1);
		tracker.add(item2);
		item1.setId(tracker.generateId());
		item2.setId(tracker.generateId());
		tracker.delete(item2.getId());
		assertThat(tracker.getAll()[0], is(item1));
	}

	/**
	 * Test Update.
	 */
	@Test
	public void whenUpdateItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", Date.from(null));
		tracker.add(item1);
		Item item2 = new Item(item1.getId(), "test2", "testDescription2", Date.from(null));
		tracker.update(item2);
		assertThat(tracker.findById(item2.getId()), is(item2));
	}

	/**
	 * Test Find id.
	 */
	@Test
	public void whenFindItemId() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", Date.from(null));
		item.setId(tracker.generateId());
		tracker.add(item);
		assertThat(tracker.findById(item.getId()), is(item));
	}

	/**
	 * Test Find itemName.
	 */
	@Test
	public void whenFindNameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription1", Date.from(null));
		tracker.add(item);
		Item[] expected = tracker.findByName(item.getName());
		assertThat(tracker.findByName(item.getName()), is(expected));
	}

	/**
	 * Test Find itemName.
	 */
	@Test
	public void whenGetAllItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription1", Date.from(null));
		tracker.add(item1);
		Item[] expected = tracker.getAll();
		assertThat(tracker.getAll(), is(expected));
	}
}