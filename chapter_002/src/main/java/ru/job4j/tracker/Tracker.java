package ru.job4j.tracker;

public class Tracker {
	private Item[] items;
	private int position = 0;

	public Item add(Item item) {
		this.items[position++] = item;
		return item;
	}

	public void update(Item item) {
	}

	public void delete(String id) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				item = items[position]; //при такой записи java понимает какой индекс у item?
				position--;
			}
		}
	}

	public Item[] getAll() {
		Item[] result = new Item[position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}

	public Item[] findByName(String key) {
	    int count = 0;
	    Item[] result = new Item[count++];
		for (Item item : items) {
			if (item != null && item.getName().equals(key)) {
				result[count] = item;
			}
		}
		return result;
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