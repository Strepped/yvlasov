package ru.job4j.loop;

/**
 * Class Paint.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class Paint {

	/**
	* Метод производит сложение.
	* @param h - первая переменная.
	* @return Возвращает параметр.
	*/
	public String piramid(int h) {
	StringBuilder s = new StringBuilder();
		for (int i = 1; i <= h; i++) {
			int w = i - 1 + i;
				if (i < h) {
				s.append(" ");
				}
					for (int y = 1; y <= w; y++) {
						s.append("^");
						String completedString = s.toString();
			}
				if (i < h) {
				s.append(" " + System.getProperty("line.separator"));
				}
		}
		return s.toString();
	}
}