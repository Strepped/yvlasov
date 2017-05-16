package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Strepped on 16.05.2017.
 */
public class MoveArrayTest {
    /**
     * Test.
     * @author Yury Vlasov
     * @version 1.0
     * @since 16.05.2017
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        int[] array = {1, 2, 3, 4, 5};
        MoveArray moveArray = new MoveArray(array);
        int[] resultArray = moveArray.shift(2);
        int[] expectArray = {4, 5, 1, 2, 3};
        assertThat(resultArray, is(expectArray));
    }
}