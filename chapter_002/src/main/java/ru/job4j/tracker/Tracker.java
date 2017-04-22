package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
	private Item[] items = new Item[10];
	private int position = 0;
	private static final Random RN = new Random();

	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	public void update(Item item) {
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(item.getId())) {
				this.items[index] = item;
				break;
			}
		}
	}

	public void delete(String id) {
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				this.items[index] = this.items[position - 1];
				position--;
			}
		}
	}

	public Item[] getAll() {
		return Arrays.copyOf(this.items, position);
	}

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