package ru.job4j;

/**
 * Class Калькулятор.
 * @author Yury Vlasov
 * @since 11.04.2017
 * @version 1.0
*/

public class Calculator {

	/**
	* Переменная результат.
	*/
	private double result;

	/**
	* Метод производит сложение.
	* @param first - первый.
	* @param second - второй.
	*/
	public void add(double first, double second) {
        this.result = first + second;
    }

	/**
	* Метод производит вычетание.
	* @param first - первый.
	* @param second - второй.
	*/
	public void substruct(double first, double second) {
        this.result = first - second;
    }

	/**
	* Метод производит умножение.
	* @param first - первый.
	* @param second - второй.
	*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }

	/**
	* Метод производит деление.
	* @param first - первый.
	* @param second - второй.
	*/
	public void div(double first, double second) {
        this.result = first / second;
    }

	/**
	* Метод возвращает значение result.
	* @return Возвращает параметр.
	*/
	public double getResult() {
		return this.result;
    }
}