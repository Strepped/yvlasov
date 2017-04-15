package ru.job4j.array;

/**
 * Class RotateArray.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class RotateArray {
	/**
	* Метод производит сложение.
	* @param array - первая переменная.
	* @return Возвращает параметр.
	*/

	public int[][] rotate(int[][] array) {
		for (int i = 0; i < (array.length + 1) / 2; i++) {
			for (int j = 0; j < array.length / 2; j++) {
				int temp = array[j][i];
				array[j][i] = array[array.length - 1 - i][j];
				array[array.length - 1 - i][j] = array[array.length - 1 - j][array.length - 1 - i];
				array[array.length - 1 - j][array.length - 1 - i] = array[i][array.length - 1 - j];
				array[i][array.length - 1 - j] = temp;
			}
		}
	return array;
	}
}