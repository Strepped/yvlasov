package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
 * @author Yury Vlasov
 * @since 11.04.2017
 * @version 1.0
*/

public class MaxTest {
/**
* Test add.
*/
    @Test
    public void whenMaxTwoOrOneThenTwo() {
	Max maximum = new Max();
	int result = maximum.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }
}