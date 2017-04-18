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

		for (int i = 0; i < chOrigin.length; i++) {
			for (int j = 0; j < chSub.length; j++) {
				if (array[i].equals(array[j])) {
					result = true;
					j = j+1;
					break;
				}
			}
		}
	}
}