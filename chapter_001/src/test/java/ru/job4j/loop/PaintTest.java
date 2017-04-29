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

public class PaintTest {
/**
* Test add.
*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %n^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
/**
* Test add.
*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^%s ^^^%n^^^^^", System.getProperty("line.separator"));
        System.out.println(result);
        assertThat(result, is(expected));
    }
}