package dev.carbajal.arraylist.test;

import java.util.*;
import dev.carbajal.arraylist.model.Item;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item(1, "This is item 1"));
		items.add(new Item(2, "This is item 2"));
		items.add(new Item(3, "This is item 3"));
		items.add(new Item(4, "This is item 4"));
		items.add(new Item(5, "This is item 5"));

		// Printing the third item

		System.out.println(items.get(2));

		// Removing the last item

		Item removed = items.remove(items.size() - 1);
		System.out.println(removed);

		// Iterating over a list

		Iterator<Item> iter = items.iterator();

		while(iter.hasNext()) {

			Item item = iter.next();
			System.out.println("Removing item: "+ item);
			iter.remove();
			// iter.remove();
			// items.add(new Item(6, "This is a new item"));

		}

		// Confirming the size of ArrayList items is now zero

		System.out.println(items.size());

	}

}
