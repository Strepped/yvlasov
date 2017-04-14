package ru.job4j.loop;

/**
 * Class Counter.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class Counter {

	/**
	* Метод производит сложение.
	* @param start - первая переменная.
	* @param finish - вторая переменная.
	* @return Возвращает параметр.
	*/
	public int add(int start, int finish) {
		int chet = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				chet = chet + i;
			}
		}
		return chet;
	}
}