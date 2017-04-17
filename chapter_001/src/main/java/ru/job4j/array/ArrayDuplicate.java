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
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					array[j] = array[array.length - 1];
					j--;
					count++;
				}
			}
		}
	return Arrays.copyOf(array, array.length - count);
	}
}