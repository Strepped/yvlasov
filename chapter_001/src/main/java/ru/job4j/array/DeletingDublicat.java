package ru.job4j.array;

import java.util.Arrays;

/**
 * Class DeletingDublicat.
 * @author Yury Vlasov
 * @since 18.04.2017
 * @version 1.0
*/

public class DeletingDublicat {

	/**
	* Метод производит сложение.
	* @param array - первая переменная.
	* @return Возвращает параметр.
	*/

	public int[] remove(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != 0 && array[j] != 0) {
					int temp = array[j];
					for (int m = j; m < array.length; m++) {
						if (array[m] == temp) {
							array[m] = 0;
							count++;
						} else {
							 break;
							}
					}
				}
			}
		}

		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] == 0) {
					array[j] = array[j + 1];
					array[j + 1] = 0;
				}
			}
		}
	return Arrays.copyOf(array, array.length - count);
	}
}