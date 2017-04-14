package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
 * @author Yury Vlasov
 * @since 14.04.2017
 * @version 1.0
*/

public class CounterTest {
/**
* Test add.
*/
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
	Counter counter = new Counter();
	int result = counter.add(1, 10);
	int expected = 30;
	assertThat(result, is(expected));
    }
}