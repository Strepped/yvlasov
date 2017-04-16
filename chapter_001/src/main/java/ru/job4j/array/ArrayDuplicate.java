package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate.
 * @author Yury Vlasov
 * @since 16.04.2017
 * @version 1.0
*/

public class ArrayDuplicate {

	/**
	* Метод производит сложение.
	* @param array - первая переменная.
	* @return Возвращает параметр.
	*/

	public String[] remove(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != null && array[j] != null && array[i].equals(array[j])) {
					array[j] = null;
					count++;
				}
			}
		}

		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] == null) {
					array[j] = array[j + 1];
					array[j + 1] = null;
				}
			}
		}
	return Arrays.copyOf(array, array.length - count);
	}
}