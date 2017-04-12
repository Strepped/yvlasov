package ru.job4j.condition.point;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
 * @author Yury Vlasov
 * @since 12.04.2017
 * @version 1.0
*/

public class PointTest {
/**
* Test add.
*/
    @Test
    public void liesPointInfunction() {
        Point point = new Point(1, 3);
        boolean result = point.is(1, 2);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}