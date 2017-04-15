package ru.job4j.array;

/**
 * Class Turn.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class Turn {
	/**
	* Метод производит сложение.
	* @param array - первая переменная.
	* @return Возвращает параметр.
	*/
	public static int[] back(int[] array) {
		for (int i = 0; array.length / 2 > i; i++) {
			int tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}
	return array;
	}
}