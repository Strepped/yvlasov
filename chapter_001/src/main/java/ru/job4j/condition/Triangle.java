package ru.job4j.condition.triangle;

/**
 * Class Triangle.
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class Triangle {
	/**
	* Две переменные описывают точку в системе координат.
	*/
	private Point a;

	/**
	* Две переменные описывают точку в системе координат.
	*/
	private Point b;

	/**
	* Две переменные описывают точку в системе координат.
	*/
	private Point c;

	/**
	* Метод производит сложение.
	* @param a - первая переменная.
	* @param b - вторая переменная.
	* @param c - вторая переменная.
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	* Мотод расчитывает площадь.
	* @return Возвращает параметр.
	*/
	public double area() {
		double result = -1D;
		double lineA = Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
		double lineB = Math.sqrt((c.x - b.x) * (c.x - b.x) + (c.y - b.y) * (c.y - b.y));
		double lineC = Math.sqrt((c.x - a.x) * (c.x - a.x) + (c.y - a.y) * (c.y - a.y));
			if ((lineA < lineB + lineC) && (lineB < lineA + lineC) && (lineC < lineA + lineB)) {
				double p = (lineA + lineB + lineC) / 2.0;
				result = Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
			}
		return result;
	}
}