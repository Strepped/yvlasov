package ru.job4j.loop;

/**
 * Class Factorial.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class Factorial {

	/**
	* Метод производит сложение.
	* @param n - первая переменная.
	* @return Возвращает параметр.
	*/
	public int calc(int n) {
		int factorial = 1;
		if (n != 0) {
			for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			}
		}
		return factorial;
	}
}