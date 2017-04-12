package ru.job4j.condition.point;

/**
 * Class Point.
 * @author Yury Vlasov
 * @since 12.04.2017
 * @version 1.0
*/

public class Point {

	/**
	* Две переменные описывают точку в системе координат.
	*/
	private int x;
	/**
	* Две переменные описывают точку в системе координат.
	*/
	private int y;

	/**
	* Метод производит сложение.
	* @param x - первая переменная.
	* @param y - вторая переменная.
	*/
	public  Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	* Метод что-то делает.
	* @return Возвращает параметр.
	*/
	public int getX() {
		return this.x;
	}

	/**
	* Метод что-то делает.
	* @return Возвращает параметр.
	*/
	public int getY() {
		return this.y;
	}

	/**
	* Метод определяющий находится ли точка на этой фукнции.
	* @param a - данные функции.
	* @param b - данные функции.
	* @return Возвращает параметр.
	*/
	public boolean is(int a, int b) {
		return y == x * a + b;
	}
}