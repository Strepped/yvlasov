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
public class RotateArrayTest {
/**
* Test add.
*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
	int[][] values = {{1, 2}, {3, 4}};
	RotateArray rotateArray = new RotateArray();
	int[][] resultArray = rotateArray.rotate(values);
	int[][] expectArray = {{3, 1}, {4, 2}};
	assertThat(resultArray, is(expectArray));
	}
/**
* Test add.
*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
	int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	RotateArray rotateArray = new RotateArray();
	int[][] resultArray = rotateArray.rotate(values);
	int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
	assertThat(resultArray, is(expectArray));
    }
}