package ru.job4j.max;

/**
 * Class Максимума.
 * @author Yury Vlasov
 * @since 11.04.2017
 * @version 1.0
*/

public class Max {

	/**
	* Метод максимума.
	* @param first - первый.
	* @param second - второй.
	* @return Возвращает параметр.
	*/
	public int max(int first, int second) {
		int max = first > second ? first : second;
		return max;
	}
}