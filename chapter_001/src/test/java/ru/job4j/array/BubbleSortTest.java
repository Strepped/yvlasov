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
public class BubbleSortTest {
/**
* Test add.
*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
	int[] values = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
	BubbleSort bubbleSort = new BubbleSort();
	int[] resultArray = bubbleSort.sort(values);
	int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
	assertThat(resultArray, is(expectArray));
	}
}