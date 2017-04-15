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
public class TurnTest {
/**
* Test add.
*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
	int[] values = {2, 6, 1, 4};
	Turn turn = new Turn();
	int[] resultArray = turn.back(values);
	int[] expectArray = {4, 1, 6, 2};
	assertThat(resultArray, is(expectArray));
    }
/**
* Test add.
*/
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
	int[] values = {1, 2, 3, 4, 5};
	Turn turn = new Turn();
	int[] resultArray = turn.back(values);
	int[] expectArray = {5, 4, 3, 2, 1};
	assertThat(resultArray, is(expectArray));
    }
}