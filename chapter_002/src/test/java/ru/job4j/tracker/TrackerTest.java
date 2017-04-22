package ru.job4j.tracker;

import org.junit.Test;

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
	public void whenAddNewItemThenTrackerHasSameItem() {
	Tracker tracker = new Tracker();
	Item item = new Item("test1", "testDescription", 123L);
	tracker.add(item);
	assertThat(tracker.getAll()[0],is(item));
	}
	/**
	 * Test add.
	 */
	@Test
	public void whenDeleteItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription1", 1L);
		Item item2 = new Item("test2", "testDescription2", 2L);
		tracker.add(item1);
		tracker.add(item2);
		tracker.delete(item2.getId());
		assertThat(tracker.getAll()[0],is(item1));
	}
}