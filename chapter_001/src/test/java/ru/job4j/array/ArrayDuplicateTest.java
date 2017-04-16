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

public class ArrayDuplicateTest {
/**
* Test add.
*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
	//напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
	String[] values = {"Привет", "Мир", "Привет", "Супер", "Мир"};
	ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
	String[] resultArray = arrayDuplicate.remove(values);
	String[] expectArray = {"Привет", "Мир", "Супер"};
	assertThat(resultArray, is(expectArray));
	}
}