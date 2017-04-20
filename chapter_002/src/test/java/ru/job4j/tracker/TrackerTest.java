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
}