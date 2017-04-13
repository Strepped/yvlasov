package ru.job4j.condition;

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
		double lineA = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
		double lineB = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
		double lineC = Math.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
			if ((lineA < lineB + lineC) && (lineB < lineA + lineC) && (lineC < lineA + lineB)) {
				double p = (lineA + lineB + lineC) / 2.0;
				result = Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
			}
		return result;
	}
}