package ru.job4j.array;

import java.util.Arrays;

/**
 * Class Testing.
 * @author Yury Vlasov
 * @since 18.04.2017
 * @version 1.0
*/

public class Testing {
	publuc boolean contains(String origin, String sub) {
		char[] chOrigin = origin.toCharArray();
		char[] chSub = sub.toCharArray();

		boolean result;
		int m = 0; // считает число совпадений.

		for (int i = 0; i < chOrigin.length; i++) {
			for (int j = 0; j < chSub.length; j++) {
				if (array[i].equals(array[j])) {
					result = true;
					j = j+1; // нужно чтоб j начинала с j+1, а не с 0. Как это реализовать.
					m++;
					break;
				} else {
				m = 0;
				}
			}
		}
		if (m = chSub.length) {
			contains = true;
		}
	return contains;
	}
}