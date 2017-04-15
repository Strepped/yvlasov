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

public class FactorialTest {
/**
* Test add.
*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
	Factorial factorial = new Factorial();
	int result = factorial.calc(5);
	int expected = 120;
	assertThat(result, is(expected));
    }
/**
* Test add.
*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
	Factorial factorial = new Factorial();
	int result = factorial.calc(0);
	int expected = 1;
	assertThat(result, is(expected));
    }
}