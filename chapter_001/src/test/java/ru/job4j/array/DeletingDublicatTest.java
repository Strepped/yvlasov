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

public class DeletingDublicatTest {
/**
* Test add.
*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	//напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
	int[] values = {1, 2, 2, 2, 3, 3, 4};
	DeletingDublicat deletingDublicat = new DeletingDublicat();
	int[] resultArray = deletingDublicat.remove(values);
	int[] expectArray = {1, 2, 3, 4};
	assertThat(resultArray, is(expectArray));
	}
}