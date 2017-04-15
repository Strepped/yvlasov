package ru.job4j.array;

/**
 * Class BubbleSort.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class BubbleSort {
	/**
	* Метод производит сложение.
	* @param array - первая переменная.
	* @return Возвращает параметр.
	*/

	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int t = array[j];
					array[j] = array[j - 1];
					array[j - 1] = t;
				}
			}
		}
	return array;
	}
}