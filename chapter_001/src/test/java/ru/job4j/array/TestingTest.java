package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class TestingTest {
/**
* Test add.
*/

	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	String values1 = "maximum";
	String values2 = "xim";
	Testing testing = new Testing();
	boolean result = testing.contains(values1, values2);
	boolean expect = true;
	assertThat(result, is(expect));
	}
}