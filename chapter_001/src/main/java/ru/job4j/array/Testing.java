package ru.job4j.array;

/**
 * Class Testing.
 * @author Yury Vlasov
 * @since 18.04.2017
 * @version 1.0
*/

public class Testing {
	/**
	* Метод производит сложение.
	* @param origin - первая переменная.
	* @param sub - первая переменная.
	* @return Возвращает параметр.
	*/

	public boolean contains(String origin, String sub) {
		char[] chOrigin = origin.toCharArray();
		char[] chSub = sub.toCharArray();

		boolean result;
		int m = 0; // считает число совпадений.

		for (int i = 0; i < chOrigin.length; i++) {
			for (int j = 0 + m; j < chSub.length; j++) {
				if (chOrigin[i] == (chSub[j])) {
				m++;
				break;
				} else {
					m = 0;
					break;
				}
			}
		}
		if (m == chSub.length) {
			result = true;
		} else {
			result = false;
		}
	return result;
	}
}
