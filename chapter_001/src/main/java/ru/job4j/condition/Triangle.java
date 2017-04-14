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
	* Метод производит сложение.
	* @param m - первая переменная.
	* @param n - вторая переменная.
	* @@return вторая переменная.
	*/
	public double dlina(Point m, Point n) {
    	    return Math.sqrt((n.getX() - m.getX()) * (n.getX() - m.getX()) + (n.getY() - m.getY()) * (n.getY() - m.getY()));
	}

	/**
	* Мотод расчитывает площадь.
	* @return Возвращает параметр.
	*/
	public double area() {
		double result = -1D;
		double lineA = this.dlina(this.a, this.b);
		double lineB = this.dlina(this.b, this.c);
		double lineC = this.dlina(this.a, this.c);
			if ((lineA < lineB + lineC) && (lineB < lineA + lineC) && (lineC < lineA + lineB)) {
				double p = (lineA + lineB + lineC) / 2.0;
				result = Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
			}
		return result;
	}
}