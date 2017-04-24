package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Class Tracker.
 * @author Yury Vlasov
 * @since 24.04.2017
 * @version 1.0
 */
public class Tracker {
	/**
	 * Переменная результат.
	 */
	private Item[] items = new Item[10];
	/**
	 * Переменная результат.
	 */
	private int position = 0;
	/**
	 * Переменная результат.
	 */
	private static final Random RN = new Random();

	/**
	 * Метод производит сложение.
	 * @return Возвращает параметр.
	 */
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	/**
	 * Метод производит сложение.
	 * @param item - первая переменная.
	 * @return Возвращает параметр.
	 */
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	/**
	 * Метод производит сложение.
	 * @param item - первая переменная.
	 */
	public void update(Item item) {
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(item.getId())) {
				this.items[index] = item;
				break;
			}
		}
	}

	/**
	 * Метод производит сложение.
	 * @param id - первая переменная.
	 */
	public void delete(String id) {
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				this.items[index] = this.items[position - 1];
				position--;
			}
		}
	}

	/**
	 * Метод производит сложение.
	 * @return Возвращает параметр.
	 */
	public Item[] getAll() {
		return Arrays.copyOf(this.items, position);
	}

	/**
	 * Метод производит сложение.
	 * @param key - первая переменная.
	 * @return Возвращает параметр.
	 */
	public Item[] findByName(String key) {
		Item[] temp = new Item[position];
		int count = 0;
		for (int index = 0; index != this.position; index++) {
			if (this.items[index].getName().equals(key)) { //items[index] != null && нужное условие?
				temp[count] = this.items[index];
				count++;
			}
		}
		return Arrays.copyOf(this.items, count);
	}

	/**
	 * Метод производит сложение.
	 * @param id - первая переменная.
	 * @return Возвращает параметр.
	 */
	protected Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
}